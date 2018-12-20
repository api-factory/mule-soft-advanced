%dw 1.0
%output application/java
%type myoffer= :object {class:"com.way2learnonline.Offer"}
%type myproduct= :object {class:"com.way2learnonline.Product"}

---
(payload.products.*product map {
			
				productId:$.productId as :number,
				name:$.name,
				brandName:$.brandName,
				offer:{
					offerPrice:$.offer.offerPrice as :number,
					offerValidUntil:$.offer.offerValidUntil as :date {format:"yyyy-MM-dd"}			
				} as :myoffer,
				
				images: $.images.*image,
				originalPrice: $.originalPrice as :number,
				description: $.description
				
} 

) orderBy $.originalPrice
		
 