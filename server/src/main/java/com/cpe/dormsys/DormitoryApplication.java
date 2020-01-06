package com.cpe.dormsys;

import java.util.stream.Stream;

import com.cpe.dormsys.entity.RoomBooking;
import com.cpe.dormsys.repository.RoomBookingRepository;


import com.cpe.dormsys.entity.DeviceProblem;
import com.cpe.dormsys.entity.DeviceType;

import com.cpe.dormsys.repository.DeviceProblemRepository;
import com.cpe.dormsys.repository.DeviceTypeRepository;

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
	ApplicationRunner init(RoomBookingRepository roomBookingRepository, DeviceTypeRepository deviceTypeRepository, DeviceProblemRepository deviceProblemRepository
	) {
		return args -> {
			
			Stream.of("อุปกรณ์ไฟฟ้า","อุปกรณ์ประปา", "คุรุภัณฑ์").forEach(type -> {
				DeviceType deviceType = new DeviceType(); // สร้าง Object Customer
				deviceType.setType(type); // set ชื่อ (name) ให้ Object ชื่อ Customer
				deviceTypeRepository.save(deviceType); // บันทึก Objcet ชื่อ Customer
			});
			
			 Stream.of("หลอดไฟ้", "ก็อกน้ำ", "มุ้งลวด").forEach(problem -> {
				DeviceProblem deviceProblem= new DeviceProblem(); // สร้าง Object Customer
				deviceProblem.setProblem(problem); // set ชื่อ (name) ให้ Object ชื่อ Customer
				deviceProblemRepository.save(deviceProblem); // บันทึก Objcet ชื่อ Customer
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
			
			deviceTypeRepository.findAll().forEach(System.out::println);
			deviceProblemRepository.findAll().forEach(System.out::println);
			roomBookingRepository.findAll().forEach(System.out::println);
			
		};
	}

}
