@REM set %HOME% to equivalent of $HOME
if "%HOME%" == "" (set "HOME=%HOMEDRIVE%%HOMEPATH%")

mvn sonar:sonar -Dsonar.projectKey=springmultimoduleseleniumtest -Dsonar.host.url=http://localhost:9000 -Dsonar.login=60bd2f01d4cab1966c2563808b06041f58b1bc2d
mvn sonar:sonar -Dsonar.projectKey=springmultimoduleseleniumtest -Dsonar.login=60bd2f01d4cab1966c2563808b06041f58b1bc2d
