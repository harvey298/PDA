@echo off
title Intellij IDE Prep
echo This Script will prep theses Gradlew files for use in the Intellij IDE
pause
gradlew genIntellijRuns
pause
cls
echo This Script is done :)
echo 
pause
exit