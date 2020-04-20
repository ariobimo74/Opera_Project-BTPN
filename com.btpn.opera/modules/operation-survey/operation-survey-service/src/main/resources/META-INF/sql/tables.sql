create table questions (
	id LONG not null primary key,
	question VARCHAR(75) null,
	answer VARCHAR(75) null,
	survey_operation_id LONG
);

create table responden (
	id LONG not null primary key,
	nik VARCHAR(75) null,
	full_name VARCHAR(75) null,
	lob VARCHAR(75) null,
	division VARCHAR(75) null,
	survey_operation_id LONG,
	total_value DOUBLE,
	answer_record VARCHAR(75) null,
	submitted_date DATE null,
	notes VARCHAR(75) null
);

create table survey_object (
	id LONG not null primary key,
	name VARCHAR(75) null
);

create table survey_operation (
	id LONG not null primary key,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	survey_object_id LONG,
	start_date DATE null,
	end_date DATE null,
	submitted_date DATE null,
	created_date DATE null,
	created_by LONG,
	modified_date DATE null,
	modified_by LONG
);

create table survey_operation_view (
	uuid_ VARCHAR(75) null,
	id LONG not null primary key,
	title VARCHAR(75) null,
	survey_object VARCHAR(75) null,
	survey_period VARCHAR(75) null,
	submitted_date DATE null
);