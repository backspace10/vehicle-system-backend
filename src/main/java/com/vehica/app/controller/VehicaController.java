package com.vehica.app.controller;

import java.util.List;

import javax.mail.MessagingException;

import org.hibernate.integrator.spi.IntegratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehica.app.model.Colors;
import com.vehica.app.model.DefaultSpecification;
import com.vehica.app.model.EmailSender;
import com.vehica.app.model.Exterior;
import com.vehica.app.model.Interior;
import com.vehica.app.model.Manufacture;
import com.vehica.app.model.MnfIds;
import com.vehica.app.model.Model;
import com.vehica.app.model.MusicSystem;
import com.vehica.app.model.Register;
import com.vehica.app.model.Segment;
import com.vehica.app.model.VehicleModel;
import com.vehica.app.service.AcService;
import com.vehica.app.service.ColorsService;
import com.vehica.app.service.DefaultSpecificationService;
import com.vehica.app.service.EmailSenderService;
import com.vehica.app.service.ExteriorService;
import com.vehica.app.service.InteriorService;
import com.vehica.app.service.ManufacturerService;
import com.vehica.app.service.ModelService;
import com.vehica.app.service.MusicSystemService;
import com.vehica.app.service.RegisterService;
import com.vehica.app.service.SegmentService;
import com.vehica.app.service.StandardSpecificationService;
import com.vehica.app.service.VehicleService;

@RestController
@RequestMapping("/api/vehicles")
@CrossOrigin
public class VehicaController {

	@Autowired
	private VehicleService vehicleService;

	@Autowired
	private RegisterService registerService;

	@Autowired
	private SegmentService segmentService;

	@Autowired
	private StandardSpecificationService standardSpecificationService;

	@Autowired
	private ModelService modelService;

	@Autowired
	private DefaultSpecificationService defaultSpecificationService;

	@Autowired
	private InteriorService interiorService;

	@Autowired
	private AcService acService;

	@Autowired
	private MusicSystemService musicSystemService;

	@Autowired
	private ManufacturerService manufacturerService;

	@Autowired
	private ExteriorService exteriorService;

	@Autowired
	private ColorsService colorsService;

	@Autowired
	private EmailSenderService emailSenderService;

	@PostMapping("/register")
	public String userRegistration(@RequestBody Register userToRegister) {
		return registerService.register(userToRegister);
	}

	@PostMapping("/login")
	public String userLogin(@RequestBody Register obj) {
		String username = obj.getUsername();
		String uname = registerService.getUsername(username);
		System.out.println(username + " " + uname);

		// password
		if (uname == null) {

			return "";
		} else {

			if (uname.equals(username)) {
				String pass = obj.getPassword();
				String pwd = registerService.getPassword(pass);

				if (pwd == null) {
					return "";
				}

				if (pwd.equals(pass)) {
					return uname;
				} else {

					return "";
				}

			} else {
				return "";
			}
		}
	}

	@GetMapping("/home")
	public String home() {
		return "on home";
	}

//	
	@GetMapping("/all")
	public List<VehicleModel> getVehiclesList() {
		return vehicleService.getVehicles();
	}

	// get vehicle by id
	@GetMapping("/vehicle/{vehicleId}")
	public VehicleModel getVehicle(@PathVariable String vehicleId) {
		return vehicleService.getVehicle(Long.parseLong(vehicleId));
	}

	@PostMapping("/add")
	public VehicleModel addVehicle(@RequestBody VehicleModel v) {
		return vehicleService.saveVehicle(v);
	}

	@PutMapping("/update")
	public VehicleModel updateVehicle(@RequestBody VehicleModel v) {
		return vehicleService.updateVehicle(v);
	}

	@DeleteMapping("/delete/{vehicleId}")
	public ResponseEntity<HttpStatus> deleteVehicle(@PathVariable String vehicleId) {

		try {
			this.vehicleService.deleteVehicle(Long.parseLong(vehicleId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// segment rest api
	// get list of segments
	@GetMapping("/getSegment")
	public List<String> getSegmentsList() {
		return segmentService.getAllSegments();
	}

	// this endpoint will receive segment id and after processing it it will return
	// list of manufacturers
//	long idd;

	@PostMapping("/postSegName")
	public List<String> findIdByName(@RequestBody Segment obj) {
		String segname = obj.getName();
		long idd = segmentService.getSegmentsIdByName(segname);

//		System.out.println(idd);
//		System.out.println(obj);
//		System.out.println(segname);

		return segmentService.getRespectiveManufc(idd);

	}

	@PostMapping("/getModelName")
	public List<String> findModelsName(@RequestBody MnfIds obj) {
		long id1 = obj.getMnfId();
		long id2 = obj.getSegId();
		System.out.println(id1);
		System.out.println(id2);
		List<String> res = modelService.getAllModelsName(id2, id1);
		System.out.println(res);
		return res;

	}

	// get standars specification
	@GetMapping("/getSpecf")
	public List<String> findStdSpecf() {
		return standardSpecificationService.getAllStdSpec();
	}

	// taking modelname as rest parameter
	@PostMapping("/postMdlName")
	public String findModelInfoById(@RequestBody Model ob) {
		String mdlname = ob.getModelName(); // getting model name
//		System.out.println(mdlname);
		long mdlId = modelService.findModelId(mdlname); // find model id from model name

		// return back model info
		return defaultSpecificationService.getDefaultSpec(mdlId);

	}

	// get seg id
	@PostMapping("/postSeggName")
	public String getSegIdByName(@RequestBody Segment ob) {
		String segName = ob.getName();
//		System.out.println(segName);
		long id = segmentService.getSegmentsIdByName(segName);
//		System.out.println(id);
		String idd = Long.toString(id);
		return idd;

	}

	// get manuf id
	@PostMapping("/postMnffName")
	public String getManffIdByName(@RequestBody Manufacture obj) {
		String mnfName = obj.getMnfName();
//		System.out.println(mnfName);
		long i = manufacturerService.getIdByManufName(mnfName);
		String id = Long.toString(i);
		return id;
	}

	// return model id
	@PostMapping("/postModelName")
	public String getModelId(@RequestBody Model ob) {
		String mdlname = ob.getModelName(); // getting model name
//		System.out.println(mdlname);
		long i = modelService.findModelId(mdlname);
		String id = Long.toString(i);
		return id; // find model id from model name

	}

	// get manuf id

	@PostMapping("/modelId")
	public String getInteriorInfo(@RequestBody Interior ob) {

		long mdlId = ob.getModelId(); // getting model id

//		interiorService.findInteriorInfo(mdlId);
		long musicId = interiorService.findMusicId(mdlId);
		// ac id
		long acId = interiorService.findAcId(mdlId);
		// airbags
		String airbags = interiorService.findAirbags(mdlId);
		// music_id

		// leather_seat
		String leather = interiorService.findLeatherSeat(mdlId);

		String acName = acService.findAcName(acId);

		String musicSystemName = musicSystemService.findMusicSystemName(musicId);

		return acName + "," + airbags + "," + leather + "," + musicSystemName; // find model id from model name

	}

	@PostMapping("/mdId")
	public String getExteriorInfo(@RequestBody Exterior ob) {

		long mdlId = ob.getModelId(); // getting model id

		long clrId = exteriorService.findColorId(mdlId);
		String colorName = exteriorService.findColorName(clrId);

		long fogLightId = exteriorService.findFogLightId(mdlId);
		String fogLightName = exteriorService.findFogLightName(fogLightId);

		long tyreId = exteriorService.findTyreId(mdlId);
		String tyreName = exteriorService.findTyreName(tyreId);

		System.out.println(clrId);
		System.out.println(colorName);

		System.out.println(fogLightId);
		System.out.println(fogLightName);

		System.out.println(tyreId);
		System.out.println(tyreName);

		return colorName + "," + fogLightName + "," + tyreName;
	}

	// configuration page-3 color config
	@PostMapping("/mdlIdColor")
	public List<String> getConfigColors(@RequestBody Model ob) {
		long id = ob.getModelId();

		System.out.println(id);

		return colorsService.getColorsList(id);

	}

	// configuration page-3 ac config
	@PostMapping("/mdlIdMusic")
	public List<String> getConfigMusic(@RequestBody Model ob) {
		long id = ob.getModelId();

		System.out.println(id);

		return musicSystemService.findMusicSystemNameByModelId(id);

	}

	@PostMapping("/getUserDetails")
	public String getuserData(@RequestBody Register ob) {
		String uname = ob.getUsername();
//		System.out.println(id);

		return registerService.getUseDetails(uname);

	}

	// get model price
	@PostMapping("/getMdlPrice")
	public String getModelPrice(@RequestBody Model ob) {
		long id = ob.getModelId();

		return modelService.findModelPriceById(id);

	}

	// get color price
	@PostMapping("/getColorPrice")
	public String getModelColorPrice(@RequestBody Colors clr) {
		String clrName = clr.getClrName();
		return colorsService.findColorPrice(clrName);

	}

	// get ac price
	@PostMapping("/getMusicPrice")
	public String getModelMusicPrice(@RequestBody MusicSystem ob) {
		String musicName = ob.getMusicName();
		return musicSystemService.getMusicSystemPrice(musicName);

	}

	// send simple(without attachment) mail
	@PostMapping("/sendEmail")
	public void triggerMail(@RequestBody EmailSender ob) {

		// get registered user mail by username
		String uname = ob.getUserName();
		String toEmail = registerService.getUseEmail(uname);
		String clientFullName = registerService.getFullName(uname);
		String subject = clientFullName + "-Order(#867)";

		String modelName = ob.getModelName();

		long qty = ob.getQty();
		long mdlId = ob.getModelId();
		String mdlPrice = modelService.findModelPriceById(mdlId);
		long price = Long.parseLong(mdlPrice);
		long total = price * qty;

//		String body="test";

		String mdlMusic = ob.getConfigMusic();
		String mdlColor = ob.getConfigMusic();

		// get music price
//		long musicPrice = Long.parseLong(musicSystemService.getMusicSystemPrice(mdlMusic));
		// get color price
//		long clrPrice = Long.parseLong(colorsService.findColorPrice(mdlColor));
//		long tot = (total + (musicPrice * qty) + (clrPrice * qty)) + 500;



		String body = "Hello," + "\n\n" + "Your Order Detals" + "\n\n" + "Model Name:- " + modelName + "\n" + "Price:- "
				+ price + "\nQuantity:- " + qty + "\n" + "------------------" + "\nTotal:- " + total + "\n\n\n"
				+ "Thanks & Regards," + "\n" + "Team @Hexagon";
		
		
		System.out.println(clientFullName);
		System.out.println(toEmail);
		System.out.println(subject);
		System.out.println(total);
		System.out.println(body);
		emailSenderService.sendSimpleEmail(toEmail, body, subject);
	}

}
