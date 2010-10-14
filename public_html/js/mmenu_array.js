// Milonic DHTML Menu
// Please note that major changes to this file have been made and is not compatible with earlier versions..
//
// You no longer need to number your menus as in previous versions. 
// The new menu structure allows you to name the menu instead. This means that you can remove menus and not break the system.
// The structure should also be much easier to modify, add & remove menus and menu items.
// 
// If you are having difficulty with the menu please read the FAQ at http://www.milonic.co.uk/menu/faq.php before contacting us.
//
// Please note that the above text CAN be erased if you wish as long as copyright notices remain in place.


// The following line is critical for menu operation, and must appear only once.
//menunum=0;menus=new Array();_d=document;function addmenu(){menunum++;menus[menunum]=menu;}function dumpmenus(){mt="<scr"+"ipt language=javascript>";for(a=1;a<menus.length;a++){mt+=" menu"+a+"=menus["+a+"];"}mt+="<\/scr"+"ipt>";_d.write(mt)}
//Please leave the above line intact. The above also needs to be enabled if it not already enabled


////////////////////////////////////
// Editable properties START here //
////////////////////////////////////

timegap=500					// The time delay for menus to remain visible on mouse off
followspeed=5				// Follow Scrolling speed (higher number makes the scrolling smoother but slower)
followrate=40				// Follow Scrolling Rate (use a minimum of 40 or you may experience problems)
suboffset_top=0;			// Sub menu offset Top position 
suboffset_left=0;			// Sub menu offset Left position

// Special effect string for IE5.5 or above please visit http://www.milonic.co.uk/menu/filters_sample.php for more filters
if(navigator.appVersion.indexOf("MSIE 6.0")>0)
{
	effect = "Fade(duration=0.2);Alpha(style=0,opacity=88);Shadow(color='#777777', Direction=135, Strength=5)"
}
else
{
	effect = "Shadow(color='#777777', Direction=135, Strength=5);"
}

style2=[					// style1 is an array of properties. You can have as many property arrays as you need. This means that menus can have their own style.
"FFF1CC",					// Mouse Off Font Color
"1C1A99",					// Mouse Off Background Color
"1C1A99",					// Mouse On Font Color
"LemonChiffon",				// Mouse On Background Color
"003366",					// Menu Border Color 
12,							// Font Size (default is px but you can specify mm, pt or a percentage)
"normal",					// Font Style (italic or normal)
"bold",						// Font Weight (bold or normal)
"Verdana, Tahoma, Arial, Helvetica, sans-serif",	// Font Name
3,							// Menu Item Padding
,	// Sub Menu Image (Leave this blank if not needed)
,							// 3D Border & Separator bar
"66ffff",					// 3D High Color
"000099",					// 3D Low Color
"1C1A99",					// Current Page Item Font Color (leave this blank to disable)
"LemonChiffon",						// Current Page Item Background Color (leave this blank to disable)
,	// Top Bar image (Leave this blank to disable)
"ffffff",					// Menu Header Font Color (Leave blank if headers are not needed)
"000099",					// Menu Header Background Color (Leave blank if headers are not needed)
]


addmenu(menu=[		// This is the array that contains your menu properties and details
"mainmenu",			// Menu Name - This is needed in order for the menu to be called
63,				// Menu Top - The Top position of the menu in pixels
0,					// Menu Left - The Left position of the menu in pixels
,					// Menu Width - Menus width in pixels
,					// Menu Border Width 
,					// Screen Position - here you can use "center;left;right;middle;top;bottom" or a combination of "center:middle"
style2,				// Properties Array - this is set higher up, as above
1,					// Always Visible - allows the menu item to be visible at all time (1=on/0=off)
,					// Alignment - sets the menu elements text alignment, values valid here are: left, right or center
,					// Filter - Text variable for setting transitional effects on menu activation - see above for more info
,					// Follow Scrolling - Tells the menu item to follow the user down the screen (visible at all times) (1=on/0=off)
1, 					// Horizontal Menu - Tells the menu to become horizontal instead of top to bottom style (1=on/0=off)
,					// Keep Alive - Keeps the menu visible until the user moves over another menu or clicks elsewhere on the page (1=on/0=off)
,					// Position of TOP sub image left:center:right
1,					// ..Now Obsolete..
,					// Right To Left - Used in Hebrew for example. (1=on/0=off)
,					// Open the Menus OnClick - leave blank for OnMouseover (1=on/0=off)
,					// ID of the div you want to hide on MouseOver (useful for hiding form elements)
,					// Reserved for future use
,					// Reserved for future use
,					// Reserved for future use
,"ATUALIZAÇÃO&nbsp;&nbsp;&nbsp;&nbsp;","show-menu=Atualizacao","#",,1// "Description Text", "URL", "Alternate URL", "Status", "Separator Bar"
,"CONSULTA&nbsp;&nbsp;&nbsp;&nbsp;","show-menu=Consulta","#",,1
])


if(document.layers)m1div="_d.layers['menu1'].document.layers['mel1'].document.layers['subscribeform']"; else m1div="subscribeform"

addmenu(menu=["Consulta","offset=3",,195,1,"",style2,,"",effect,,,,,,,,m1div,,,,
,"Espelho do Cadastro", "/cota/consultaEspelhoEntidade.do",,,1
,"Coeficiente do Alunado", "/cota/consultaCoeficienteAlunado.do?",,,1
/*,"Tabelas de apoio", "show-menu=tabelasApoio",,,1*/
])

/*
addmenu(menu=["tabelasApoio","offset=3",,245,1,"",style2,,"",effect,,,,,,,,m1div,,,,
,"Programa, Nível ou Modalidade","/first/selecionarProgramaNivelModalidade.do",,,1
,"Ação","/first/selecionarAcao.do",,,1
,"Público Alvo","/first/selecionarPublicoAlvo.do",,,1
,"Bloco","/first/selecionarBloco.do",,,1
,"Pergunta","/first/selecionarPergunta.do",,,1
,"Tipo de Resposta","/first/selecionarTipoResposta.do",,,1
])

*/

addmenu(menu=["Atualizacao","offset=3",,155,1,"",style2,,"",effect,,,,,,,,,,,,
,"Cadastro", "/cota/cadastroSecretaria.do?",,,1

])

addmenu(menu=["consulta","offset=3",,155,1,"",style2,,"",effect,,,,,,,,,,,,
,"???", "",,,1
])



//////////////////////////////////
// Editable properties END here //
//////////////////////////////////
dumpmenus() // This must be the last line in this file
