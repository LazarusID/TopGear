cmake_minimum_required(VERSION 3.1.0 FATAL_ERROR)
PROJECT(TopGear)

add_subdirectory(googletest)
add_subdirectory(test)

set(APP_SOURCE
	GearBox.cpp GearBox.h)


add_executable(${PROJECT_NAME}
	main.cpp
	${APP_SOURCE}
	)
