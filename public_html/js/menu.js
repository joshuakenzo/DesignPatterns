var layerRef;
var layerStyle;
var menuName;

var xLoc=0;
var yLoc=0;
var menu=0;
var isXLocked=0;
var xset=0;
var yset=0;

function mouseMove(e){
	if(document.all && ready == "yes"){
		x=event.x;
		y=event.y;
	}
	if(document.layers && ready == "yes"){
		x=e.pageX;
		y=e.pageY;
	}
}

if (document.all){
	document.onmousemove = mouseMove;
	layerRef = "document.all";
	layerStyle = ".style";
}
if (document.layers){
	document.onmousemove = mouseMove;
	document.captureEvents(Event.MOUSEMOVE);
	layerRef = "document.layers";
	layerStyle = ""; 
}

function showLayer(layerName){
	eval(layerRef+'["'+layerName+'"]'+layerStyle+'.visibility="visible"');
}

function hideLayer(layerName){
	eval(layerRef+'["'+layerName+'"]'+layerStyle+'.visibility="hidden"');
}

function moveLayer(layerName,top,left){
    eval(layerRef+'["'+layerName+'"]'+layerStyle+'.top=top');
    eval(layerRef+'["'+layerName+'"]'+layerStyle+'.left=left');
}

function rem(){
	if(document.all || document.layers){
		hideLayer("bannerSis");
		hideLayer("bannerRel");
	}
}

		
function menuOn(lName){
	if(document.all || document.layers){
		rem();
		if(lName == "bannerSis"){
			menuName = lName;
			moveLayer(lName,10,180); // Posição do Layer
			showLayer(lName);
		}
		if(lName == "bannerRel"){
			menuName = lName;
			moveLayer(lName,10,400); // Posição do Layer
			showLayer(lName);
		}
	}
}

var ready = "yes";

