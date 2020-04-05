create table answers (
	id LONG not null primary key,
	answer VARCHAR(75) null,
	value DOUBLE
);

create table questions (
	id LONG not null primary key,
	question VARCHAR(75) null
);

create table survey_object (
	id LONG not null primary key,
	name VARCHAR(75) null
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