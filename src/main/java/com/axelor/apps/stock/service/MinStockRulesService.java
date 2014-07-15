/**
 * Axelor Business Solutions
 *
 * Copyright (C) 2012-2014 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.stock.service;

import java.math.BigDecimal;

import com.axelor.apps.base.db.Product;
import com.axelor.apps.organisation.db.Project;
import com.axelor.apps.supplychain.db.Location;
import com.axelor.apps.supplychain.db.LocationLine;
import com.axelor.apps.supplychain.db.MinStockRules;
import com.axelor.exception.AxelorException;
import com.google.inject.persist.Transactional;

public interface MinStockRulesService {
	
	
	@Transactional(rollbackOn = {AxelorException.class, Exception.class})
	public void generatePurchaseOrder(Product product, BigDecimal qty, LocationLine locationLine, Project project, int type) throws AxelorException; 
	
	
	public boolean useMinStockRules(LocationLine locationLine, MinStockRules minStockRules, BigDecimal qty, int type); 
	
	public MinStockRules getMinStockRules(Product product, Location location, int type); 
	
	
}
