package com.cpe.dormsys;

import java.util.stream.Stream;

import com.cpe.dormsys.entity.RoomBooking;
import com.cpe.dormsys.entity.Staff;
import com.cpe.dormsys.entity.VehicleType;
import com.cpe.dormsys.repository.RoomBookingRepository;
import com.cpe.dormsys.repository.StaffRepository;
import com.cpe.dormsys.repository.VehicleTypeRepository;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DormitoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DormitoryApplication.class, args);
	}

	@Bean
	ApplicationRunner init(RoomBookingRepository roomBookingRepository, 
	VehicleTypeRepository vehicleTypeRepository, StaffRepository staffRepository) {
		return args -> {
			Stream.of("รถจักรยานยนต์", "รถยนต์", "จักรยาน").forEach(type -> {
				VehicleType	vehicleType = new VehicleType(); // สร้าง Object Customer
				vehicleType.setType(type); // set ชื่อ (name) ให้ Object ชื่อ Customer
				vehicleTypeRepository.save(vehicleType); // บันทึก Objcet ชื่อ Customer
			});

			Stream.of("สมพร ศรีสุข", "ชาติชัย มาดี", "นานา จิตา").forEach(staffName -> {
				Staff staff = new Staff();
				staff.setStaffName(staffName);
				staffRepository.save(staff);
			});

			RoomBooking rbk1 = new RoomBooking("ดนัย ใจดี", "S701");		
			roomBookingRepository.save(rbk1);
			RoomBooking rbk2 = new RoomBooking("สมศรี อมมอด", "S702");
			roomBookingRepository.save(rbk2);
			RoomBooking rbk3 = new RoomBooking("พรชัย วงวง", "S703");
			roomBookingRepository.save(rbk3);
			RoomBooking rbk4 = new RoomBooking("กรรไช ทำทะ", "S701");		
			roomBookingRepository.save(rbk4);
			RoomBooking rbk5 = new RoomBooking("หรรมสา มอมิ", "S702");
			roomBookingRepository.save(rbk5);
			RoomBooking rbk6 = new RoomBooking("จุจุ มุมือ", "S703");
			roomBookingRepository.save(rbk6);
			RoomBooking rbk7 = new RoomBooking("คุณนะ มานะ", "S701");		
			roomBookingRepository.save(rbk7);
			RoomBooking rbk8 = new RoomBooking("ตาสสี อดออม", "S702");
			roomBookingRepository.save(rbk8);
			RoomBooking rbk9 = new RoomBooking("สมพร วงเวียน", "S703");
			roomBookingRepository.save(rbk9);
			
			roomBookingRepository.findAll().forEach(System.out::println);
			vehicleTypeRepository.findAll().forEach(System.out::println);
			staffRepository.findAll().forEach(System.out::println);
		};
	}

}
