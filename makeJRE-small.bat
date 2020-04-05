
rmdir /S /Q  out\jre

"C:\Program Files\Java\jdk-9.0.4\bin\bin\jlink.exe" 
	--module-path "C:\Program Files\Java\jdk-9.0.4\bin\jmods";out
	--add-modules course.java9.jokeui
	--launcher JOKER=course.java9.jokeui/course.java9.jokeui.App 
	--compress 2
	--no-header-files
	--no-man-pages
	--strip-debug
	--output out\jre