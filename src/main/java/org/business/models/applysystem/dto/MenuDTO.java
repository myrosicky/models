package org.business.models.applysystem.dto;

import java.util.List;

import lombok.Data;

import org.business.models.MenuRole;

@Data
public class MenuDTO {

	private List<MenuRole> menus;
	
}
