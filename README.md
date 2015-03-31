# Android-library-kit
A simple to use library for Android common tasks 

## Common tasks in an Android developer's life

```java
if (NetworkMonitor.isConnectedToInternet(myContext)) {
	// Do something
}

AlertManager.showAlertDialog(myContext, "Hello world", "This is a super alert!");

AlertManager.showToast(myContext, "Hello toast", 3);

String md5 = EncryptionUtils.md5("encodeThisToMD5");
```
