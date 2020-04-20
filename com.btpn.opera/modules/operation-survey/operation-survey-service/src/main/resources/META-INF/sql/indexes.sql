create index IX_643133F5 on questions (survey_operation_id);

create index IX_EFC5C224 on responden (survey_operation_id);

create index IX_B4D7C000 on survey_operation (title[$COLUMN_LENGTH:75$]);

create index IX_E1B728C0 on survey_operation_view (title[$COLUMN_LENGTH:75$]);
create index IX_2A78CF6C on survey_operation_view (uuid_[$COLUMN_LENGTH:75$]);