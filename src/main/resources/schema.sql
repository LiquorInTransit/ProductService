CREATE TABLE PRODUCT(
	ID BIGINT NOT NULL PRIMARY KEY,
	ALCOHOL_CONTENT BIGINT,
	DESCRIPTION VARCHAR(2000),
	IMAGE_THUMB_URL VARCHAR(500),
	IMAGE_URL VARCHAR(500),
	IS_DEAD BOOLEAN,
	IS_DISCONTINUED BOOLEAN,
	IS_KOSHER BOOLEAN,
	IS_OCB BOOLEAN,
	IS_SEASONAL BOOLEAN,
	IS_VQA BOOLEAN,
	NAME VARCHAR(255),
	ORIGIN VARCHAR(255),
	PACKAGE_UNIT_TYPE VARCHAR(255),
	PACKAGE_UNIT_VOLUME_IN_MILLILITERS BIGINT,
	PACKAGE VARCHAR(300),
	PRICE_IN_CENTS BIGINT,
	PRIMARY_CATEGORY VARCHAR(255),
	PRODUCER_NAME VARCHAR(255),
	RELEASED_ON VARCHAR(255),
	SECONDARY_CATEGORY VARCHAR(255),
	SERVING_SUGGESTION VARCHAR(1000),
	STOCK_TYPE VARCHAR(255),
	STYLE VARCHAR(255),
	TAGS VARCHAR(500),
	TASTING_NOTE VARCHAR(2000),
	TERTIARY_CATEGORY VARCHAR(255),
	TOTAL_PACKAGE_UNITS BIGINT,
	UPDATED_AT VARCHAR(255),
	VARIETAL VARCHAR(255),
	VOLUME_IN_MILLILITERS BIGINT
);