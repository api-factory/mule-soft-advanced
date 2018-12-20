%dw 1.0
%var conversionRate= 65
//%function getConvertedOriginalPrice(price) price*conversionRate
%var getConvertedOriginalPrice= (price)-> price*conversionRate
%var getImages = (images) -> {
								(
									images  map {
										img : $
									}
								)
							 } 
%output application/xml 
---
products: {
	(
		( payload map (product,indexOfProduct)-> 
			{
			product : {
				productId:product.productId,
				name:product.name,
				brandName:product.brandName,
				originalPrice: getConvertedOriginalPrice(product.originalPrice),
				(images : getImages(product.images) ) when product.images?
						
					
					
			}
		} orderBy $.product.originalPrice
		)[-1..0]

	)
}