package com.core.service;

import com.core.entity.AdDocuments;
import com.core.entity.OrderHeader;
import com.core.entity.ProductInfo;
import com.core.entity.RdDocuments;

public interface OrderService {
	
	public OrderHeader addOrder(OrderHeader order);
	
	public ProductInfo addProduct(ProductInfo product);
	
	public AdDocuments AdDocumentsGenerateAndPersist(OrderHeader order);
	
	public RdDocuments RdDocumentsGenerateAndPersist(OrderHeader order);

}
