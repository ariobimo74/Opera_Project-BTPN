create index IX_75282F6D on questions (question[$COLUMN_LENGTH:75$]);

create index IX_5410C2C9 on survey_object (name[$COLUMN_LENGTH:75$]);

create index IX_47D0AF0E on survey_operation (end_date);
create index IX_B4D7C000 on survey_operation (title[$COLUMN_LENGTH:75$]);