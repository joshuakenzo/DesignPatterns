<script language="Javascript">
var objhandle;
document.onkeydown = function() {
  // Capture and remap F9
  if (window.event && window.event.keyCode >= 112 && window.event.keyCode <= 123) {
    if (window.event.keyCode == 120) {
      var retval = window.showModalDialog('../teladialogo/dialogo.html');
    } 
    return false;
  }
  return true;
}
</script>