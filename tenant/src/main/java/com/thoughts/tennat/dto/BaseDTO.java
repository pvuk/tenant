package com.thoughts.tennat.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Wed 21-Apr-2021 16:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseDTO implements Serializable {

	private static final long serialVersionUID = -267720347975012649L;
	
	public int statusCode;
	public String statusMessage;
}
