-- Populate static metadata tables
-- ! copy is a PostgreSQL specific function

copy countries (iso, fullname)
from 'metadata/countries.csv'
with delimiter ',';

copy profiletypes (profile)
from 'metadata/profiletypes.csv';

copy stafftypes (stafftype)
from 'metadata/stafftypes.csv';

copy activitytypes (activity, colorcode)
from 'metadata/activitytypes.csv'
with delimiter ',';

copy languages (language)
from 'metadata/languages.csv';

copy staffconfirmedtype (stafftype)
from 'metadata/staffconfirmedtypes.csv';

copy missionmetatypes (missiontype)
from 'metadata/missionmetatypes.csv';

copy operationtypes (operationname)
from 'metadata/operationtypes.csv';
