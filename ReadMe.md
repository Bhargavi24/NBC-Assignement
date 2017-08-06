#This is ReadMe file for NASSA API test cases
 Name: NASA
 
 Version :1.0
 
 libraries : C:\Users\Bhargavi\Downloads\selenium-java-2.48.2\selenium-2.48.2\selenium-java-2.48.2.jar
C:\selenium-java-2.48.2\selenium-2.48.2\selenium-java-2.48.2-srcs.jar
C:\selenium-server-standalone-3.4.0.jar
C:\selenium-java-3.4.0\lib\commons-codec-1.10.jar
C:\selenium-java-3.4.0\lib\commons-io-2.5.jar
C:\selenium-java-3.4.0\lib\commons-lang3-3.5.jar
C:\selenium-java-3.4.0\lib\commons-logging-1.2.jar
C:\selenium-java-3.4.0\lib\cssparser-0.9.22.jar
C:\selenium-java-3.4.0\lib\gson-2.8.0.jar
C:\selenium-java-3.4.0\lib\guava-21.0.jar
C:\selenium-java-3.4.0\lib\hamcrest-core-1.3.jar
C:\selenium-java-3.4.0\lib\htmlunit-2.26.jar
 
 Test cases:
 Test Case 1: 
 
 Test scenario Name : Verifyning the rate limit-limit & Rate limit reamining.
 Expectred Results : No.of discriptions.
 q value : asdasdsafggfh
 API Key : UnPPJLAzy0eRpm5xV6UrMvTIs6yYB4AvCvV50R5X
 Limit : 10
 Author : Bhargavi-Tester
 pausing : "results": [{"description": "The Voyager 1 spacecraft has experienced three \"tsunami waves\" in interstellar space. Listen to how these waves cause surrounding ionized matter to ring.
 More details on this sound can be found here: http://www.nasa.gov/jpl/nasa-voyager-tsunami-wave-still-flies-through-interstellar-space/", "license": "cc-by-nc-sa", 
 "title": "Voyager 1: Three \"Tsunami Waves\" in Interstellar Space", "download_url": "https://api.soundcloud.com/tracks/181835738/download", "duration": 18365, 
 "last_modified": "2014/12/16 22:34:23 +0000", "stream_url": "https://api.soundcloud.com/tracks/181835738/stream", "tag_list": "Space", "id": 181835738}, 
 {"description": "Courtesy of United Launch Alliance", "license": "cc-by-nc", "title": "Delta IV: Launch", "download_url": "https://api.soundcloud.com/tracks/173578614/download", 
 "duration": 30095, "last_modified": "2014/10/24 02:16:33 +0000", "stream_url": "https://api.soundcloud.com/tracks/173578614/stream", "tag_list": "space", "id": 173578614}, 
 {"description": null, "license": "cc-by-nc", "title": "Wheel Stop", "download_url": "https://api.soundcloud.com/tracks/172463130/download", "duration": 5903, 
 "last_modified": "2014/10/16 19:29:13 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463130/stream", "tag_list": "space", "id": 172463130},
 {"description": null, "license": "cc-by-nc", "title": "Vector Transfer", "download_url": "https://api.soundcloud.com/tracks/172463129/download", "duration": 3760, 
 "last_modified": "2014/10/16 19:29:12 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463129/stream", "tag_list": "space", "id": 172463129},
 {"description": null, "license": "cc-by-nc", "title": "Roger Roll", "download_url": "https://api.soundcloud.com/tracks/172463128/download", "duration": 1515, 
 "last_modified": "2014/10/16 19:29:12 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463128/stream", "tag_list": "space", "id": 172463128}, 
 {"description": null, "license": "cc-by-nc", "title": "On its way to Orbit", "download_url": "https://api.soundcloud.com/tracks/172463126/download", "duration": 7497,
 "last_modified": "2014/10/16 19:29:12 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463126/stream", "tag_list": "space", "id": 172463126}, 
 {"description": null, "license": "cc-by-nc", "title": "Press to ATO", "download_url": "https://api.soundcloud.com/tracks/172463124/download", "duration": 2560, 
 "last_modified": "2014/10/16 19:29:12 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463124/stream", "tag_list": "space", "id": 172463124}, 
 {"description": null, "license": "cc-by-nc", "title": "Nice to be in Orbit", "download_url": "https://api.soundcloud.com/tracks/172463122/download", "duration": 5641, 
 "last_modified": "2014/10/16 19:29:11 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463122/stream", "tag_list": "space", "id": 172463122}, 
 {"description": null, "license": "cc-by-nc", "title": "MECO", "download_url": "https://api.soundcloud.com/tracks/172463117/download", "duration": 3187, 
 "last_modified": "2014/10/16 19:29:11 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463117/stream", "tag_list": "space", "id": 172463117}, 
 {"description": null, "license": "cc-by-nc", "title": "Lookin At It", "download_url": "https://api.soundcloud.com/tracks/172463116/download", "duration": 2429, 
 "last_modified": "2014/10/16 19:29:10 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463116/stream", "tag_list": "space", "id": 172463116}]}
 Expected results : got 10 discriptions as we have given the limit value as 10 with the q value "asdasdsafggfh" and API key "UnPPJLAzy0eRpm5xV6UrMvTIs6yYB4AvCvV50R5X"
 comments: X-RateLimit-Limit-----1000
X-RateLimit-Remaining-------988
 
 Test Case 2: 
 
 Test scenario Name : Verifyning the rate limit-limit & Rate limit reamining.
 Expectred Results : No.of discriptions.
 q value : Apollo
 API Key : UnPPJLAzy0eRpm5xV6UrMvTIs6yYB4AvCvV50R5X
 Limit : 5
 Author : Bhargavi-Tester
 count : 5
 pausing : {"count": 5, "results": 
 [{"description": "The Voyager 1 spacecraft has experienced three \"tsunami waves\" in interstellar space. Listen to how these waves cause surrounding ionized matter to ring. 
 More details on this sound can be found here: http://www.nasa.gov/jpl/nasa-voyager-tsunami-wave-still-flies-through-interstellar-space/", "license": "cc-by-nc-sa", 
 "title": "Voyager 1: Three \"Tsunami Waves\" in Interstellar Space", "download_url": "https://api.soundcloud.com/tracks/181835738/download", "duration": 18365, 
 "last_modified": "2014/12/16 22:34:23 +0000", "stream_url": "https://api.soundcloud.com/tracks/181835738/stream", "tag_list": "Space", "id": 181835738}, 
 {"description": "Courtesy of United Launch Alliance", "license": "cc-by-nc", "title": "Delta IV: Launch", "download_url": "https://api.soundcloud.com/tracks/173578614/download",
 "duration": 30095, "last_modified": "2014/10/24 02:16:33 +0000", "stream_url": "https://api.soundcloud.com/tracks/173578614/stream", "tag_list": "space", "id": 173578614},
 {"description": null, "license": "cc-by-nc", "title": "Wheel Stop", "download_url": "https://api.soundcloud.com/tracks/172463130/download", "duration": 5903,
 "last_modified": "2014/10/16 19:29:13 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463130/stream", "tag_list": "space", "id": 172463130}, 
 {"description": null, "license": "cc-by-nc", "title": "Vector Transfer", "download_url": "https://api.soundcloud.com/tracks/172463129/download", "duration": 3760,
 "last_modified": "2014/10/16 19:29:12 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463129/stream", "tag_list": "space", "id": 172463129}, 
 {"description": null, "license": "cc-by-nc", "title": "Roger Roll", "download_url": "https://api.soundcloud.com/tracks/172463128/download", "duration": 1515, 
 "last_modified": "2014/10/16 19:29:12 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463128/stream", "tag_list": "space", "id": 172463128}]}
 Expected Results : got 5 discriptions as we have given the limit value as 5 with the q value "Apollo" and API key "UnPPJLAzy0eRpm5xV6UrMvTIs6yYB4AvCvV50R5X"
 comments: X-RateLimit-Limit-----1000
X-RateLimit-Remaining-------988


 Test Case 3:
 
 Test scenario Name : Verifyning the rate limit-limit & Rate limit reamining.
 Expectred Results : No.of discriptions.
 q value : tsunami
 API Key : UnPPJLAzy0eRpm5xV6UrMvTIs6yYB4AvCvV50R5X
 Limit : 15
 Author : Bhargavi-Tester
 count : 5
 pausing : [{"description": "The Voyager 1 spacecraft has experienced three \"tsunami waves\" in interstellar space. Listen to how these waves cause surrounding ionized matter to ring. 
 More details on this sound can be found here: http://www.nasa.gov/jpl/nasa-voyager-tsunami-wave-still-flies-through-interstellar-space/", "license": "cc-by-nc-sa", 
 "title": "Voyager 1: Three \"Tsunami Waves\" in Interstellar Space", "download_url": "https://api.soundcloud.com/tracks/181835738/download", "duration": 18365, 
 "last_modified": "2014/12/16 22:34:23 +0000", "stream_url": "https://api.soundcloud.com/tracks/181835738/stream", "tag_list": "Space", "id": 181835738}, 
 {"description": "Courtesy of United Launch Alliance", "license": "cc-by-nc", "title": "Delta IV: Launch", "download_url": "https://api.soundcloud.com/tracks/173578614/download",
 "duration": 30095, "last_modified": "2014/10/24 02:16:33 +0000", "stream_url": "https://api.soundcloud.com/tracks/173578614/stream", "tag_list": "space", "id": 173578614},
 {"description": null, "license": "cc-by-nc", "title": "Wheel Stop", "download_url": "https://api.soundcloud.com/tracks/172463130/download", "duration": 5903,
 "last_modified": "2014/10/16 19:29:13 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463130/stream", "tag_list": "space", "id": 172463130}, 
 {"description": null, "license": "cc-by-nc", "title": "Vector Transfer", "download_url": "https://api.soundcloud.com/tracks/172463129/download", "duration": 3760,
 "last_modified": "2014/10/16 19:29:12 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463129/stream", "tag_list": "space", "id": 172463129}, 
 {"description": null, "license": "cc-by-nc", "title": "Roger Roll", "download_url": "https://api.soundcloud.com/tracks/172463128/download", "duration": 1515, 
 "last_modified": "2014/10/16 19:29:12 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463128/stream", "tag_list": "space", "id": 172463128}]}
 pausing : "results": [{"description": "The Voyager 1 spacecraft has experienced three \"tsunami waves\" in interstellar space. Listen to how these waves cause surrounding ionized matter to ring.
 More details on this sound can be found here: http://www.nasa.gov/jpl/nasa-voyager-tsunami-wave-still-flies-through-interstellar-space/", "license": "cc-by-nc-sa", 
 "title": "Voyager 1: Three \"Tsunami Waves\" in Interstellar Space", "download_url": "https://api.soundcloud.com/tracks/181835738/download", "duration": 18365, 
 "last_modified": "2014/12/16 22:34:23 +0000", "stream_url": "https://api.soundcloud.com/tracks/181835738/stream", "tag_list": "Space", "id": 181835738}, 
 {"description": "Courtesy of United Launch Alliance", "license": "cc-by-nc", "title": "Delta IV: Launch", "download_url": "https://api.soundcloud.com/tracks/173578614/download", 
 "duration": 30095, "last_modified": "2014/10/24 02:16:33 +0000", "stream_url": "https://api.soundcloud.com/tracks/173578614/stream", "tag_list": "space", "id": 173578614}, 
 {"description": null, "license": "cc-by-nc", "title": "Wheel Stop", "download_url": "https://api.soundcloud.com/tracks/172463130/download", "duration": 5903, 
 "last_modified": "2014/10/16 19:29:13 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463130/stream", "tag_list": "space", "id": 172463130},
 {"description": null, "license": "cc-by-nc", "title": "Vector Transfer", "download_url": "https://api.soundcloud.com/tracks/172463129/download", "duration": 3760, 
 "last_modified": "2014/10/16 19:29:12 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463129/stream", "tag_list": "space", "id": 172463129},
 {"description": null, "license": "cc-by-nc", "title": "Roger Roll", "download_url": "https://api.soundcloud.com/tracks/172463128/download", "duration": 1515, 
 "last_modified": "2014/10/16 19:29:12 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463128/stream", "tag_list": "space", "id": 172463128}, 
 {"description": null, "license": "cc-by-nc", "title": "On its way to Orbit", "download_url": "https://api.soundcloud.com/tracks/172463126/download", "duration": 7497,
 "last_modified": "2014/10/16 19:29:12 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463126/stream", "tag_list": "space", "id": 172463126}, 
 {"description": null, "license": "cc-by-nc", "title": "Press to ATO", "download_url": "https://api.soundcloud.com/tracks/172463124/download", "duration": 2560, 
 "last_modified": "2014/10/16 19:29:12 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463124/stream", "tag_list": "space", "id": 172463124}, 
 {"description": null, "license": "cc-by-nc", "title": "Nice to be in Orbit", "download_url": "https://api.soundcloud.com/tracks/172463122/download", "duration": 5641, 
 "last_modified": "2014/10/16 19:29:11 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463122/stream", "tag_list": "space", "id": 172463122}, 
 {"description": null, "license": "cc-by-nc", "title": "MECO", "download_url": "https://api.soundcloud.com/tracks/172463117/download", "duration": 3187, 
 "last_modified": "2014/10/16 19:29:11 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463117/stream", "tag_list": "space", "id": 172463117}, 
 {"description": null, "license": "cc-by-nc", "title": "Lookin At It", "download_url": "https://api.soundcloud.com/tracks/172463116/download", "duration": 2429, 
 "last_modified": "2014/10/16 19:29:10 +0000", "stream_url": "https://api.soundcloud.com/tracks/172463116/stream", "tag_list": "space", "id": 172463116}]}
 Expected Results : got 15 discriptions as we have given the limit value as 15 with the q value "tusnami" and API key "UnPPJLAzy0eRpm5xV6UrMvTIs6yYB4AvCvV50R5X"
 comments: X-RateLimit-Limit-----1000
X-RateLimit-Remaining-------988
 
 
 
 
 