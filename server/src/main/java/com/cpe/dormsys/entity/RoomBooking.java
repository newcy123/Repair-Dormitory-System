package com.cpe.dormsys.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name = "ROOMBOOKING")
public class RoomBooking {

    @Id
    @SequenceGenerator(name="roombooking_seq",sequenceName="roombooking_seq")               
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="roombooking_seq")  
    @Column(name = "ROOMBOOKING_ID", unique = true, nullable = true)
    private @NonNull Long id;

    private @NonNull String stdName;

    private @NonNull String roomNo;

    @OneToMany(fetch = FetchType.EAGER)
    private Collection<Repair> repair;

    public RoomBooking() {}
    public RoomBooking(String stdName, String roomNo) {
        this.stdName = stdName;
        this.roomNo = roomNo;
    }
}