Showing some dates using java.util.Date.<br/>
I could not get a date before JC.<br/>
<br/>
How to compile and execute :<br/>
mvn package<br/>
java -cp target/datesBefore1970withJavaUtilDate-0.0.1-SNAPSHOT.jar datesBefore1970withJavaUtilDate.DatesBefore1970<br/>
<br/>
<br/>
showYear1970(); -> year 70<br/>
showYear1969(); -> year 69<br/>
showYear1900(); -> year 0<br/>
showYear1899(); -> year -1<br/>
showYear2(); -> year -1898<br/>
showYear1(); -> year -1899<br/>
showYear0(); -> year -1899<br/>
showYearMinus1();// -1898 fail -> I would expect -1900 :(<br/>
showYearMinus2();// -1897 fail -> I would expect -1901 :(<br/>
<br/>
<br/>
The application intents to represent some dates using java.util.Date but fails to do so for dates before year 0 (1970 years before unix epoch). The application display those dates in the terminal.<br/>
<br/>
For some more informations on java.util.Date you may have a look here : https://codeblog.jonskeet.uk/2017/04/23/all-about-java-util-date/<br/>
