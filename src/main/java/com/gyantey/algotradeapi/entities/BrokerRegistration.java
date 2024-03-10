package com.gyantey.algotradeapi.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="brokerinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrokerRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int brokerId;
	private String brokerName;
	

}
