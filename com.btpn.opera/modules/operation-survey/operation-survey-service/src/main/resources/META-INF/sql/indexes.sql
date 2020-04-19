create index IX_643133F5 on questions (survey_operation_id);

create index IX_EFC5C224 on responden (survey_operation_id);

create index IX_B4D7C000 on survey_operation (title[$COLUMN_LENGTH:75$]);