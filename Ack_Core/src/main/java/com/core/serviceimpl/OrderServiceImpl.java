package com.core.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.Repository.AdDocRepository;
import com.core.Repository.OrderHeaderRepository;
import com.core.Repository.ProductInfoRepository;
import com.core.entity.AdDocuments;
import com.core.entity.OrderHeader;
import com.core.entity.ProductInfo;
import com.core.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderHeaderRepository orderRepo;
	@Autowired
	private ProductInfoRepository pRepo;
	@Autowired
	private AdDocRepository adDocRepo;

	@Override
	public OrderHeader addOrder(OrderHeader order) {
		OrderHeader save = orderRepo.save(order);
		return save;
		
	}

	@Override
	public ProductInfo addProduct(ProductInfo product) {
		ProductInfo productInfo = pRepo.save(product);
		return productInfo;
	}

	@Override
	public AdDocuments AdDocumentsGenerateAndPersist(OrderHeader order) {
		AdDocuments adDoc = new AdDocuments();
		ProductInfo storeProductInfo= pRepo.findByproductNumber(order.getOrderitems().getProductNumber());
		if(storeProductInfo.getProductQty()>= order.getOrderitems().getProductQty()) {
			
			adDoc.setAcknowledgementType("AD");
			adDoc.setUserName(order.getUserName());
			adDoc.setPoNumber(order.getPoNumber());
			adDoc.setOrderitems(order.getOrderitems());
			adDocRepo.save(adDoc);
		}
				
		return adDoc;
	}

}
