@echo off
echo Building ReelsEditor...
cd /d "%~dp0"
if exist gradlew.bat (
    gradlew.bat assembleDebug
) else (
    echo Gradle wrapper not found. Please run 'gradle wrapper' first.
    pause
)