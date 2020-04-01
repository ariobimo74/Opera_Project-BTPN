create table questions (
	id LONG not null primary key,
	question VARCHAR(75) null,
	answer VARCHAR(75) null,
	value DOUBLE
);

create table survey_operation (
	id LONG not null primary key,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	survey_obj VARCHAR(75) null,
	start_date DATE null,
	end_date DATE null,
	submitted_date DATE null
);