package com.gazorpazorp.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//	"id",
//	"is_dead",
//	"name",
//	"tags",
//	"is_discontinued",
//	"price_in_cents",
//	"regular_price_in_cents",
//	"limited_time_offer_savings_in_cents",
//	"limited_time_offer_ends_on",
//	"bonus_reward_miles",
//	"bonus_reward_miles_ends_on",
//	"stock_type",
//	"primary_category",
//	"secondary_category",
//	"origin",
//	"package",
//	"package_unit_type",
//	"package_unit_volume_in_milliliters",
//	"total_package_units",
//	"volume_in_milliliters",
//	"alcohol_content",
//	"price_per_liter_of_alcohol_in_cents",
//	"price_per_liter_in_cents",
//	"inventory_count",
//	"inventory_volume_in_milliliters",
//	"inventory_price_in_cents",
//	"sugar_content",
//	"producer_name",
//	"released_on",
//	"has_value_added_promotion",
//	"has_limited_time_offer",
//	"has_bonus_reward_miles",
//	"is_seasonal",
//	"is_vqa",
//	"is_ocb",
//	"is_kosher",
//	"value_added_promotion_description",
//	"description",
//	"serving_suggestion",
//	"tasting_note",
//	"updated_at",
//	"image_thumb_url",
//	"image_url",
//	"varietal",
//	"style",
//	"tertiary_category",
//	"sugar_in_grams_per_liter",
//	"clearance_sale_savings_in_cents",
//	"has_clearance_sale",
//	"product_no"
//})
@Entity
public class Product {
	///////////////////////////////////////
	//LCBO-API Stored Properties
	///////////////////////////////////////
	@Id
	private Long id;
	private Boolean isDead;
	private String name;
	private String tags;
	private Boolean isDiscontinued;
	private Long priceInCents;
	private Long regularPriceInCents;
	private Long limitedTimeOfferSavingsInCents;
	private Long bonusRewardMiles;
	private String stockType;
	private String primaryCategory;
	private String secondaryCategory;
	private String origin;
	private String packageUnitType;
	private Long packageUnitVolumeInMilliliters;
	private Long totalPackageUnits;
	private Long volumeInMilliliters;
	private Long alcoholContent;
	private Long pricePerLiterOfAlcoholInCents;
	private Long pricePerLiterInCents;
	private Long inventoryCount;
	private Long inventoryVolumeInMilliliters;
	private Long inventoryPriceInCents;
	private String producerName;
	private String releasedOn;
	private Boolean hasValueAddedPromotion;
	private Boolean hasLimitedTimeOffer;
	private Boolean hasBonusRewardMiles;
	private Boolean isSeasonal;
	private Boolean isVqa;
	private Boolean isOcb;
	private Boolean isKosher;
	private String description;
	private String servingSuggestion;
	private String tastingNote;
	private String updatedAt;
	private String imageThumbUrl;
	private String imageUrl;
	private String varietal;
	private String style;
	private String tertiaryCategory;
	private Long clearanceSaleSavingsInCents;
	private Boolean hasClearanceSale;
	private Long productNo;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getIsDead() {
		return isDead;
	}

	public void setIsDead(Boolean isDead) {
		this.isDead = isDead;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Boolean getIsDiscontinued() {
		return isDiscontinued;
	}

	public void setIsDiscontinued(Boolean isDiscontinued) {
		this.isDiscontinued = isDiscontinued;
	}

	public Long getPriceInCents() {
		return priceInCents;
	}

	public void setPriceInCents(Long priceInCents) {
		this.priceInCents = priceInCents;
	}

	public Long getRegularPriceInCents() {
		return regularPriceInCents;
	}

	public void setRegularPriceInCents(Long regularPriceInCents) {
		this.regularPriceInCents = regularPriceInCents;
	}

	public Long getLimitedTimeOfferSavingsInCents() {
		return limitedTimeOfferSavingsInCents;
	}

	public void setLimitedTimeOfferSavingsInCents(Long limitedTimeOfferSavingsInCents) {
		this.limitedTimeOfferSavingsInCents = limitedTimeOfferSavingsInCents;
	}


	public Long getBonusRewardMiles() {
		return bonusRewardMiles;
	}

	public void setBonusRewardMiles(Long bonusRewardMiles) {
		this.bonusRewardMiles = bonusRewardMiles;
	}


	public String getStockType() {
		return stockType;
	}

	public void setStockType(String stockType) {
		this.stockType = stockType;
	}

	public String getPrimaryCategory() {
		return primaryCategory;
	}

	public void setPrimaryCategory(String primaryCategory) {
		this.primaryCategory = primaryCategory;
	}

	public String getSecondaryCategory() {
		return secondaryCategory;
	}

	public void setSecondaryCategory(String secondaryCategory) {
		this.secondaryCategory = secondaryCategory;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}



	public String getPackageUnitType() {
		return packageUnitType;
	}

	public void setPackageUnitType(String packageUnitType) {
		this.packageUnitType = packageUnitType;
	}

	public Long getPackageUnitVolumeInMilliliters() {
		return packageUnitVolumeInMilliliters;
	}

	public void setPackageUnitVolumeInMilliliters(Long packageUnitVolumeInMilliliters) {
		this.packageUnitVolumeInMilliliters = packageUnitVolumeInMilliliters;
	}

	public Long getTotalPackageUnits() {
		return totalPackageUnits;
	}

	public void setTotalPackageUnits(Long totalPackageUnits) {
		this.totalPackageUnits = totalPackageUnits;
	}

	public Long getVolumeInMilliliters() {
		return volumeInMilliliters;
	}

	public void setVolumeInMilliliters(Long volumeInMilliliters) {
		this.volumeInMilliliters = volumeInMilliliters;
	}

	public Long getAlcoholContent() {
		return alcoholContent;
	}

	public void setAlcoholContent(Long alcoholContent) {
		this.alcoholContent = alcoholContent;
	}

	public Long getPricePerLiterOfAlcoholInCents() {
		return pricePerLiterOfAlcoholInCents;
	}

	public void setPricePerLiterOfAlcoholInCents(Long pricePerLiterOfAlcoholInCents) {
		this.pricePerLiterOfAlcoholInCents = pricePerLiterOfAlcoholInCents;
	}

	public Long getPricePerLiterInCents() {
		return pricePerLiterInCents;
	}

	public void setPricePerLiterInCents(Long pricePerLiterInCents) {
		this.pricePerLiterInCents = pricePerLiterInCents;
	}

	public Long getInventoryCount() {
		return inventoryCount;
	}

	public void setInventoryCount(Long inventoryCount) {
		this.inventoryCount = inventoryCount;
	}

	public Long getInventoryVolumeInMilliliters() {
		return inventoryVolumeInMilliliters;
	}

	public void setInventoryVolumeInMilliliters(Long inventoryVolumeInMilliliters) {
		this.inventoryVolumeInMilliliters = inventoryVolumeInMilliliters;
	}

	public Long getInventoryPriceInCents() {
		return inventoryPriceInCents;
	}

	public void setInventoryPriceInCents(Long inventoryPriceInCents) {
		this.inventoryPriceInCents = inventoryPriceInCents;
	}



	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	public String getReleasedOn() {
		return releasedOn;
	}

	public void setReleasedOn(String releasedOn) {
		this.releasedOn = releasedOn;
	}

	public Boolean getHasValueAddedPromotion() {
		return hasValueAddedPromotion;
	}

	public void setHasValueAddedPromotion(Boolean hasValueAddedPromotion) {
		this.hasValueAddedPromotion = hasValueAddedPromotion;
	}

	public Boolean getHasLimitedTimeOffer() {
		return hasLimitedTimeOffer;
	}

	public void setHasLimitedTimeOffer(Boolean hasLimitedTimeOffer) {
		this.hasLimitedTimeOffer = hasLimitedTimeOffer;
	}

	public Boolean getHasBonusRewardMiles() {
		return hasBonusRewardMiles;
	}

	public void setHasBonusRewardMiles(Boolean hasBonusRewardMiles) {
		this.hasBonusRewardMiles = hasBonusRewardMiles;
	}

	public Boolean getIsSeasonal() {
		return isSeasonal;
	}

	public void setIsSeasonal(Boolean isSeasonal) {
		this.isSeasonal = isSeasonal;
	}

	public Boolean getIsVqa() {
		return isVqa;
	}

	public void setIsVqa(Boolean isVqa) {
		this.isVqa = isVqa;
	}

	public Boolean getIsOcb() {
		return isOcb;
	}

	public void setIsOcb(Boolean isOcb) {
		this.isOcb = isOcb;
	}

	public Boolean getIsKosher() {
		return isKosher;
	}

	public void setIsKosher(Boolean isKosher) {
		this.isKosher = isKosher;
	}

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getServingSuggestion() {
		return servingSuggestion;
	}

	public void setServingSuggestion(String servingSuggestion) {
		this.servingSuggestion = servingSuggestion;
	}

	public String getTastingNote() {
		return tastingNote;
	}

	public void setTastingNote(String tastingNote) {
		this.tastingNote = tastingNote;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getImageThumbUrl() {
		return imageThumbUrl;
	}

	public void setImageThumbUrl(String imageThumbUrl) {
		this.imageThumbUrl = imageThumbUrl;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getVarietal() {
		return varietal;
	}

	public void setVarietal(String varietal) {
		this.varietal = varietal;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getTertiaryCategory() {
		return tertiaryCategory;
	}

	public void setTertiaryCategory(String tertiaryCategory) {
		this.tertiaryCategory = tertiaryCategory;
	}

	public Long getClearanceSaleSavingsInCents() {
		return clearanceSaleSavingsInCents;
	}

	public void setClearanceSaleSavingsInCents(Long clearanceSaleSavingsInCents) {
		this.clearanceSaleSavingsInCents = clearanceSaleSavingsInCents;
	}

	public Boolean getHasClearanceSale() {
		return hasClearanceSale;
	}

	public void setHasClearanceSale(Boolean hasClearanceSale) {
		this.hasClearanceSale = hasClearanceSale;
	}

	public Long getProductNo() {
		return productNo;
	}

	public void setProductNo(Long productNo) {
		this.productNo = productNo;
	}

	


	@Override
	public String toString() {
		return "LCBOItem [id=" + id + ", isDead=" + isDead + ", name=" + name + ", tags=" + tags + ", isDiscontinued="
				+ isDiscontinued + ", priceInCents=" + priceInCents + ", regularPriceInCents=" + regularPriceInCents
				+ ", limitedTimeOfferSavingsInCents=" + limitedTimeOfferSavingsInCents + ", limitedTimeOfferEndsOn="
				+ ", bonusRewardMiles=" + bonusRewardMiles + ", bonusRewardMilesEndsOn="
				+ ", stockType=" + stockType + ", primaryCategory=" + primaryCategory
				+ ", secondaryCategory=" + secondaryCategory + ", origin=" + origin + ", _package="
				+ ", packageUnitType=" + packageUnitType + ", packageUnitVolumeInMilliliters="
				+ packageUnitVolumeInMilliliters + ", totalPackageUnits=" + totalPackageUnits + ", volumeInMilliliters="
				+ volumeInMilliliters + ", alcoholContent=" + alcoholContent + ", pricePerLiterOfAlcoholInCents="
				+ pricePerLiterOfAlcoholInCents + ", pricePerLiterInCents=" + pricePerLiterInCents + ", inventoryCount="
				+ inventoryCount + ", inventoryVolumeInMilliliters=" + inventoryVolumeInMilliliters
				+ ", inventoryPriceInCents=" + inventoryPriceInCents + ", sugarContent="
				+ ", producerName=" + producerName + ", releasedOn=" + releasedOn + ", hasValueAddedPromotion="
				+ hasValueAddedPromotion + ", hasLimitedTimeOffer=" + hasLimitedTimeOffer + ", hasBonusRewardMiles="
				+ hasBonusRewardMiles + ", isSeasonal=" + isSeasonal + ", isVqa=" + isVqa + ", isOcb=" + isOcb
				+ ", isKosher=" + isKosher + ", valueAddedPromotionDescription="
				+ ", description=" + description + ", servingSuggestion=" + servingSuggestion + ", tastingNote="
				+ tastingNote + ", updatedAt=" + updatedAt + ", imageThumbUrl=" + imageThumbUrl + ", imageUrl="
				+ imageUrl + ", varietal=" + varietal + ", style=" + style + ", tertiaryCategory=" + tertiaryCategory
				+ ", sugarInGramsPerLiter=" + ", clearanceSaleSavingsInCents="
				+ clearanceSaleSavingsInCents + ", hasClearanceSale=" + hasClearanceSale + ", productNo=" + productNo
				+ ", additionalProperties=" + "]";
	}	
}
