<SCRIPT LANGUAGE="JavaScript">
<!-- menyembunyikan script dan browser non-JS
function pass()
{
var coba = 1;
 do
  {
   p = prompt("Tuliskan password dengan benar","");
   if (p=="110420")
    {
      alert("Selamat Datang SOBAT CATATAN SEDERHANA");
      window.open("private.txt");
      break;
    }
   else
    {
      alert("Password Salah !!! Ulangi lagi.");
    }
   if (coba==3)
    {
      alert("maaf, kesempatan anda hanya 3 kali");
     history.go(-1);
    }
  coba=coba+1;
  }
 while (coba<=3)
}              
// akhir dari penyembunyian -->
</SCRIPT>
<FORM METHOD="post">
<INPUT TYPE="button" VALUE="Password" ONCLICK="pass()">
</FORM>
</BODY>
</HTML>
