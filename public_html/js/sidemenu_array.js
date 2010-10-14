if(navigator.appVersion.indexOf("MSIE 6.0")>0)
{
	effect = "Fade(duration=0.2);Shadow(color='#777777', Direction=135, Strength=5)"
}
else
{
	effect = "Shadow(color='#777777', Direction=135, Strength=5)"
}

menunum=0;menus=new Array();_d=document;function addmenu(){menunum++;menus[menunum]=menu;}function dumpmenus(){mt="<scr"+"ipt language=javascript>";for(a=1;a<menus.length;a++){mt+=" menu"+a+"=menus["+a+"];"}mt+="<\/scr"+"ipt>";_d.write(mt)}


style1=[					// style1 is an array of properties. You can have as many property arrays as you need. This means that menus can have their own style.
"000066",					// Mouse Off Font Color
"fffacd",					// Mouse Off Background Color
"fffacd",					// Mouse On Font Color
"0066CC",					// Mouse On Background Color
"00008B",					// Menu Border Color
"10px",							// Font Size in pixels
"normal",					// Font Style (italic or normal)
"normal",						// Font Weight (bold or normal)
"Verdana, Tahoma, Arial, Helvetica, sans-serif;",	// Font Name
3,							// Menu Item Padding
,			// Sub Menu Image (Leave this blank if not needed)
,							// 3D Border & Separator bar
"66ffff",					// 3D High Color
"000099",					// 3D Low Color
,							// Referer Item Font Color (leave this blank to disable)
,							// Referer Item Background Color (leave this blank to disable)
"arrowdn.gif",				// Top Bar image (Leave this blank to disable)
"ffffff",					// Menu Header Font Color (Leave blank if headers are not needed)
"000099",					// Menu Header Background Color (Leave blank if headers are not needed)
]


//effect2 = "Alpha( style=0,opacity=65)"
//effect=""


dumpmenus();