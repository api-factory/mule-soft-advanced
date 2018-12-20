%dw 1.0
%output application/java

---
payload.products.*product map {
			
				productId:$.productId ,
				productName:$.name,
				brandName:$.brandName,
				offer:{
					offerPrice:$.offer.offerPrice ,
					offerValidUntil:$.offer.offerValidUntil 
				},
				
				images: $.images.*image,
				originalPrice:$.originalPrice
				
				
		}
		
