**Reaper** is a dynamic analysis system that traces the permissions requested by apps in real time and distinguishes those requested by the app's core functionality from those requested by third-party libraries linked with the app.

The core functionality of Reaper consists of two Xposed modules:

**reaper.PermissionHarvester**

**reaper.UIHarvester**


**Prerequisites:** Magisk, Riru, Lsposed Framework

**How to install:**

*reaper.PermissionHarvester*

Download the module,compile and build the apk.

1)install the module (do not activate yet and do not reboot)

2)adb shell su chmod 711 /data/data/reaper.PermissionHarvester

3)Activate the module

4)Reboot 


*reaper.UIHarvester*

Download the module,compile and build the apk.

1)Install the module (do not activate yet and do not reboot)

2)adb shell su chmod 711 /data/data/reaper.UIHarvester

3)Activate the module

4)Reboot 

These steps are necessary because of the SELinux policy and in order to activate the shared preferences used in both modules.


**Logcat Output**

Both modules output all the information to logcat. 

Example:

The encoded string from the logcat 
encoded="UIHarvesterT2JqZWN0IGdldENsYXNzOiBjbGFzcyBhbmRyb2lkLnN1cHBvcnQudjcud2lkZ2V0LkFwcENvbXBhdFRleHRWaWV3CmN1cnJlbnRQYWNrYWdlTmFtZTogY29tLmltZGIubW9iaWxlCmlzQ2xpY2thYmxlOiAwCmlzQ29udGV4dENsaWNrYWJsZTogMApoYXNPbkNsaWNrTGlzdGVuZXJzOiAwCmlzTG9uZ0NsaWNrYWJsZTogMAppc1ByZXNzZWQ6IDAKaXNGb2N1c2FibGU6IDAKaXNFbmFibGVkOiAxCmdldEltcG9ydGFudEZvckFjY2Vzc2liaWxpdHk6IDEKaXNTaG93bjogMQpoYXNXaW5kb3dGb2N1czogMQpwYXJlbnRDbGlja2FibGU6IDEKRGlzcGxheVNpemU6IDEwODAgMTc5NApDb29yZHM6IDU3IDY1ODYKTG9jYXRpb246IERvd25MZWZ0CmdldFRhZzogbnVsbApSZXNvdXJjZUlkOiBzdHJpbmcKVGV4dDogVGhlIExlZ28gTW92aWUgMjogVGhlIFNlY29uZCBQYXJ0CmdldFRleHRTaXplOiAzNy4wCmdldFR5cGVmYWNlOiAwClRleHRMZW5ndGg6IDMzCmdldEN1cnJlbnRUZXh0Q29sb3I6ICNGRkZGRkYKZ2V0V2lkdGg6IDMyNApnZXRIZWlnaHQ6IDEwMwo="


**How to use:**

*reaper.PermissionHarvester*

1) Open Lsposed
2) Enable the PermissionHarvester module and select the target app(s).

*reaper.UIHarvester*

1) Open Lsposed
2) Enable the UIHarvester module and select the target app(s).
3) Add app(s) package name(s) to /data/data/reaper.UIHarvester/current_apps on device's path.
