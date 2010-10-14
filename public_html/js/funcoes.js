function BloqueiaCaracter(){
	if (event.keyCode < 48 || event.keyCode > 57) 
		event.returnValue = false;	
}


function BloqueiaNumeroPontos(){
	if ( ( (event.keyCode >= 42) && (event.keyCode <= 57) ) || ((event.keyCode <= 93)&&(event.keyCode >=91)) || (event.keyCode == 180) || (event.keyCode == 32) || (event.keyCode == 61) || (event.keyCode == 59) || (event.keyCode == 126)){
		event.returnValue = false;
	}
}


function janela(arq, larg, altu, nome){
	window.open(arq,nome,'width=550,height=350,location=0,menubar=0,scrollbars=yes,resizable=0,left=100,top=100,toolbar=0,top=10,left=10');
}

// Cria uma nova janela sem ferramentas de navegação
// e chama a funão limpa_tempo, utilizado na análise
// documental e físico financeiro
function novaJanela(url,nome){
  var topo = (screen.height - 500)/2;
  var esq =  (screen.width - 790)/2;
  var props = "toolbar=no, location=no, status=no, menubar=no, scrollbars=1, resizable=yes, width=790,height=500, top="+topo+", left="+esq;
  window.open(url,nome,props);
  //limpa_tempo();
}


function formataValor(campo, milSep, decSep, e) {
	var sep = 0;
	var key = '';
	var i = j = 0;
	var len = len2 = 0;
	var strCheck = '0123456789';
	var aux = aux2 = '';
	var whichCode = (window.Event) ? e.which : e.keyCode;
	if (whichCode == 13) return true;  // Enter
		key = String.fromCharCode(whichCode);  // Get key value from key code
	if (strCheck.indexOf(key) == -1) return false;  // Not a valid key
		len = campo.value.length;
	for(i = 0; i < len; i++)
	if ((campo.value.charAt(i) != '0') && (campo.value.charAt(i) != decSep)) break;
		aux = '';
	for(; i < len; i++)
	if (strCheck.indexOf(campo.value.charAt(i))!=-1) aux += campo.value.charAt(i);
		aux += key;
		len = aux.length;
	if (len == 0) campo.value = '';
	if (len == 1) campo.value = '0'+ decSep + '0' + aux;
	if (len == 2) campo.value = '0'+ decSep + aux;
	if (len > 2) {
		aux2 = '';
		for (j = 0, i = len - 3; i >= 0; i--) {
			if (j == 3) {
				aux2 += milSep;
				j = 0;
			}
			aux2 += aux.charAt(i);
			j++;
	}
	campo.value = '';
	len2 = aux2.length;
	for (i = len2 - 1; i >= 0; i--)
	campo.value += aux2.charAt(i);
	campo.value += decSep + aux.substr(len - 2, len);
	}
	return false;
}

function tiraMascara(str) {
	temp = str;
	while(temp.indexOf(".") != -1)temp = temp.replace( ".", "" );
	while(temp.indexOf(",") != -1)temp = temp.replace( ",", "" );
	return temp;
}

function formatoMonetario(num){	
	num = num.toString(); 
	tam = num.length;	 
	if(tam < 2 ){ 		   
	 		num = num ;	 		
	 	}	 
	 	if(tam > 2 && tam <= 5){		 
	 		num = num.substr(0,tam - 2) + ',' + num.substr(tam - 2, tam);	 		
	 	}
	 	if ((tam >= 6) && (tam <= 8)){		 	
	 		num = num.substr(0,tam - 5) + '.' + num.substr(tam - 5, 3) + ',' + num.substr(tam - 2, tam);
	 	}
	 	if ((tam >= 9) && (tam <= 11)){
	 		num = num.substr(0,tam - 8) + '.' + num.substr(tam - 8, 3) + '.' + num.substr(tam - 5, 3) + ',' + num.substr(tam - 2, tam);
	 	}
	 	if ((tam >= 12) && (tam <= 14)){
	 		num = num.substr(0,tam - 11) + '.' + num.substr(tam - 11, 3) + '.' + num.substr(tam - 8, 3) + '.' + num.substr(tam - 5, 3) + ',' + num.substr(tam - 2, tam);
	 	}
	 	if ((tam >= 15) && (tam <= 17)){
	 		num = num.substr(0,tam - 14) + '.' + num.substr(tam - 14, 3) + '.' + num.substr(tam - 11, 3) + '.' + num.substr(tam - 8, 3) + '.' + num.substr(tam - 5, 3) + ',' + num.substr(tam - 2, tam);
	 	}
    return (num); 
}
 
//  Esta função limita o tamando do Texto digitado num TextArea
//  e mostra quantos caracteres que faltam através de um Input
//  <textarea name="messagem" cols="28" rows="5"
//  onKeyDown="contaTexto(document.meuForm.messagem,document.meuForm.remTam,125)"
//  onKeyUp="contaTexto(document.meuForm.messagem,document.meuForm.remTam,125)"></textarea>
//  <br>
//  <input readonly type="text" name="remTam" size="3" maxlength="3" value="125">
//  Quantidade de caracteres  (máximo 125)
//  <br>
//
//  campo--->Nome do TextArea
//  ctncampo--->Nome do Input
//  maxlimit-->Quantida máxima de caracteres permitidos 

function contaTexto(campo,cntcampo,maxlimit) {
if (campo.value.length > maxlimit) 
campo.value = campo.value.substring(0, maxlimit);
// senão, move o caractere para esquerda
else
cntcampo.value = maxlimit - campo.value.length;
}






<!-- Begin
    //Exemplo: onFocus="javascript:vDateType='3'" onKeyUp="DateFormat(this,this.value,event,false,'3')" onBlur="DateFormat(this,this.value,event,true,'3')"
	var isNav4 = false, isNav5 = false, isIE4 = false // checando verção do browser
	var strSeperator = "/"; // Variave do Separador
	var vDateType = 3; // Formato da Data
	//    1 = mm/dd/yyyy
	//    2 = yyyy/dd/mm
	//    3 = dd/mm/yyyy
	var vYearType = 4; // Numero de Digitos no ANO 2 ou 4
	var vYearLength = 2; 
	var err = 0; 
	
	if(navigator.appName == "Netscape") {
		if (navigator.appVersion < "5") {
			isNav4 = true;
			isNav5 = false;
		}
		else
		if (navigator.appVersion > "4") {
			isNav4 = false;
			isNav5 = true;
		}
	}
	else {
		isIE4 = true;
	}

	function DateFormat(vDateName, vDateValue, e, dateCheck, dateType) {
		
		vDateType = dateType;
		// vDateName = Nome Objeto
		// vDateValue = Valor do Objeto
		// e = evento
		// dateCheck 
		// True  = Verifica se vDateValue é uma data valida
		// False = Formata o valor de entrada para vDateValue
		// vDateType = Tipo do Formato da Data
		// 1 = mm/dd/yyyy
		// 2 = yyyy/mm/dd
		// 3 = dd/mm/yyyy
		
		var whichCode = (window.Event) ? e.which : e.keyCode;
		
		// Verificando o separado.
		if (vDateValue.length > 8 && isNav4) {
			if ((vDateValue.indexOf("-") >= 1) || (vDateValue.indexOf("/") >= 1))
			return true;
		}
		
		//Eliminando todos os Codigos ASCII não validos
		var alphaCheck = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ/-";
		
		if (alphaCheck.indexOf(vDateValue) >= 1) {
			if (isNav4) {
				vDateName.value = "";
				vDateName.focus();
				vDateName.select();
				return false;
			}	
			else {
				vDateName.value = vDateName.value.substr(0, (vDateValue.length-1));
				return false;
			}
		}
		
		if (whichCode == 8) //Ignorando espaços em branco para Netscape.
			return false;
		else {
			//Criando String numerica com os valores 0123456789/
			var strCheck = '47,48,49,50,51,52,53,54,55,56,57,58,59,95,96,97,98,99,100,101,102,103,104,105';
			if (strCheck.indexOf(whichCode) != -1) {
				if (isNav4) {
					if (((vDateValue.length < 6 && dateCheck) || (vDateValue.length == 7 && dateCheck)) && (vDateValue.length >=1)) {
							alert("Data Inválida!");
							vDateName.value = "";
							vDateName.focus();
							vDateName.select();
							return false;
					}
					if (vDateValue.length == 6 && dateCheck) {
						var mDay = vDateName.value.substr(2,2);
						var mMonth = vDateName.value.substr(0,2);
						var mYear = vDateName.value.substr(4,4)
			
						if (mYear.length == 2 && vYearType == 4) {
							var mToday = new Date();
							var checkYear = mToday.getFullYear() + 30; 
							var mCheckYear = '20' + mYear;
							if (mCheckYear >= checkYear)
								mYear = '19' + mYear;
							else
								mYear = '20' + mYear;
						}
						
						var vDateValueCheck = mMonth+strSeperator+mDay+strSeperator+mYear;
						
						if (!dateValid(vDateValueCheck)) {
							alert("Data Inválida!");
							vDateName.value = "";
							vDateName.focus();
							vDateName.select();
							return false;
						}
						return true;
					}
					else {
						// Reformatando a data para validação
						if (vDateValue.length >= 8  && dateCheck) {
							if (vDateType == 1) {
								var mDay = vDateName.value.substr(2,2);
								var mMonth = vDateName.value.substr(0,2);
								var mYear = vDateName.value.substr(4,4)
								vDateName.value = mMonth+strSeperator+mDay+strSeperator+mYear;
							}
							if (vDateType == 2) {
								var mYear = vDateName.value.substr(0,4)
								var mMonth = vDateName.value.substr(4,2);
								var mDay = vDateName.value.substr(6,2);
								vDateName.value = mYear+strSeperator+mMonth+strSeperator+mDay;
							}
							if (vDateType == 3) {
								var mMonth = vDateName.value.substr(2,2);
								var mDay = vDateName.value.substr(0,2);
								var mYear = vDateName.value.substr(4,4)
								vDateName.value = mDay+strSeperator+mMonth+strSeperator+mYear;
							}
							
							//Criando Variavel Temporaria para guardar o valor da DateType para modificação
							var vDateTypeTemp = vDateType;
							vDateType = 1;
							var vDateValueCheck = mMonth+strSeperator+mDay+strSeperator+mYear;
							
							if (!dateValid(vDateValueCheck)) {
								alert("Data Inválida!");
								vDateType = vDateTypeTemp;
								vDateName.value = "";
								vDateName.focus();
								vDateName.select();
								return false;
							}
							
							vDateType = vDateTypeTemp;
							return true;
						}
						else {
							if (((vDateValue.length < 8 && dateCheck) || (vDateValue.length == 9 && dateCheck)) && (vDateValue.length >=1)) {
									alert("Data Inválida!");
									vDateName.value = "";
									vDateName.focus();
									vDateName.select();
									return false;
							}
						}
					}
				}
				else {
					if (((vDateValue.length < 8 && dateCheck) || (vDateValue.length == 9 && dateCheck)) && (vDateValue.length >=1)) {
							alert("Data Inválida!");
							vDateName.value = "";
							vDateName.focus();
							return true;
					}

					if (vDateValue.length >= 8 && dateCheck) {
						if (vDateType == 1) {	
							var mMonth = vDateName.value.substr(0,2);
							var mDay = vDateName.value.substr(3,2);
							var mYear = vDateName.value.substr(6,4)
						}
						if (vDateType == 2) {
							var mYear = vDateName.value.substr(0,4)
							var mMonth = vDateName.value.substr(5,2);
							var mDay = vDateName.value.substr(8,2);
						}
						if (vDateType == 3) {
							var mDay = vDateName.value.substr(0,2);
							var mMonth = vDateName.value.substr(3,2);
							var mYear = vDateName.value.substr(6,4)
						}
						if (vYearLength == 4) {
							if (mYear.length < 4) {
								alert("Data Inválida!");
								vDateName.value = "";
								vDateName.focus();
								return true;
						   }
						}
						
						var vDateTypeTemp = vDateType;
						vDateType = 1;
						var vDateValueCheck = mMonth+strSeperator+mDay+strSeperator+mYear;
						
						if (mYear.length == 2 && vYearType == 4 && dateCheck) {
							//Turn a two digit year into a 4 digit year
							var mToday = new Date();
							var checkYear = mToday.getFullYear() + 30; 
							var mCheckYear = '20' + mYear;
							if (mCheckYear >= checkYear)
							mYear = '19' + mYear;
						else
							mYear = '20' + mYear;
							vDateValueCheck = mMonth+strSeperator+mDay+strSeperator+mYear;
							
							if (vDateTypeTemp == 1) // mm/dd/yyyy
							vDateName.value = mMonth+strSeperator+mDay+strSeperator+mYear;
							if (vDateTypeTemp == 3) // dd/mm/yyyy
							vDateName.value = mDay+strSeperator+mMonth+strSeperator+mYear;
						} 
						if (!dateValid(vDateValueCheck)) {
							alert("Data Inválida!");
							vDateType = vDateTypeTemp;
							vDateName.value = "";
							vDateName.focus();
							return true;
						}
						
						vDateType = vDateTypeTemp;
						return true;
					}	
					else {
						if (vDateType == 1) {
							if (vDateValue.length == 2) {
								vDateName.value = vDateValue+strSeperator;
							}
							if (vDateValue.length == 5) {
								vDateName.value = vDateValue+strSeperator;
							}
						}
						if (vDateType == 2) {
							if (vDateValue.length == 4) {
								vDateName.value = vDateValue+strSeperator;
							}
							if (vDateValue.length == 7) {
								vDateName.value = vDateValue+strSeperator;
							}
						} 
						if (vDateType == 3) {
							if (vDateValue.length == 2) {
								vDateName.value = vDateValue+strSeperator;
							}
							if (vDateValue.length == 5) {
								vDateName.value = vDateValue+strSeperator;
						   }
						}
						return true;
					}
				}

				if (vDateValue.length == 10&& dateCheck) {
					if (!dateValid(vDateName)) {
						// Un-comment the next line of code for debugging the dateValid() function error messages
						//alert(err);  
						alert("Data Inválida!");
						vDateName.focus();
						vDateName.select();
					}
				}
				return false;
			}
			else {
				// If the value is not in the string return the string minus the last
				// key entered.
				if (isNav4) {
					vDateName.value = "";
					vDateName.focus();
					vDateName.select();
					return false;
				}
				else {
					vDateName.value = vDateName.value.substr(0, (vDateValue.length-1));
					return false;
				}
			}
		}
	}
	
	function dateValid(objName) {
		var strDate;
		var strDateArray;
		var strDay;
		var strMonth;
		var strYear;
		var intday;
		var intMonth;
		var intYear;
		var booFound = false;
		var datefield = objName;
		var strSeparatorArray = new Array("-"," ","/",".");
		var intElementNr;
		// var err = 0;
		var strMonthArray = new Array(12);
		strMonthArray[0] = "Jan";
		strMonthArray[1] = "Feb";
		strMonthArray[2] = "Mar";
		strMonthArray[3] = "Apr";
		strMonthArray[4] = "May";
		strMonthArray[5] = "Jun";
		strMonthArray[6] = "Jul";
		strMonthArray[7] = "Aug";
		strMonthArray[8] = "Sep";
		strMonthArray[9] = "Oct";
		strMonthArray[10] = "Nov";
		strMonthArray[11] = "Dec";
		//strDate = datefield.value;
		strDate = objName;
		
		if (strDate.length < 1) {
			return true;
		}
		for (intElementNr = 0; intElementNr < strSeparatorArray.length; intElementNr++) {
			if (strDate.indexOf(strSeparatorArray[intElementNr]) != -1) {
				strDateArray = strDate.split(strSeparatorArray[intElementNr]);
				if (strDateArray.length != 3) {
					err = 1;
					return false;
				}
				else {
					strDay = strDateArray[0];
					strMonth = strDateArray[1];
					strYear = strDateArray[2];
				}
				booFound = true;
			}
		}
		
		if (booFound == false) {
			if (strDate.length>5) {
				strDay = strDate.substr(0, 2);
				strMonth = strDate.substr(2, 2);
				strYear = strDate.substr(4);
			}
		}
		//Adjustment for short years entered
		if (strYear.length == 2) {
			strYear = '20' + strYear;
		}

		strTemp = strDay;
		strDay = strMonth;
		strMonth = strTemp;
		intday = parseInt(strDay, 10);
		if (isNaN(intday)) {
			err = 2;
			return false;
		}
		
		intMonth = parseInt(strMonth, 10);
		
		if (isNaN(intMonth)) {
			for (i = 0;i<12;i++) {
				if (strMonth.toUpperCase() == strMonthArray[i].toUpperCase()) {
					intMonth = i+1;
					strMonth = strMonthArray[i];
					i = 12;
				}
			}
			if (isNaN(intMonth)) {
				err = 3;
				return false;
			}
		}	
		
		intYear = parseInt(strYear, 10);
		
		if (isNaN(intYear)) {
			err = 4;
			return false;
		}
		if (intMonth>12 || intMonth<1) {
			err = 5;
			return false;
		}
		if ((intMonth == 1 || intMonth == 3 || intMonth == 5 || intMonth == 7 || intMonth == 8 || intMonth == 10 || intMonth == 12) && (intday > 31 || intday < 1)) {
			err = 6;
			return false;
		}
		if ((intMonth == 4 || intMonth == 6 || intMonth == 9 || intMonth == 11) && (intday > 30 || intday < 1)) {
			err = 7;
			return false;
		}
		if (intMonth == 2) {
			if (intday < 1) {
				err = 8;
				return false;
			}
			if (LeapYear(intYear) == true) {
				if (intday > 29) {
					err = 9;
					return false;
				}
			}
			else {
				if (intday > 28) {
					err = 10;
					return false;
				}
			}
		}
		return true;
	}	

	function LeapYear(intYear) {
		if (intYear % 100 == 0) {
			if (intYear % 400 == 0) { return true; }
		}
		else {
			if ((intYear % 4) == 0) { return true; }
		}
		return false;
	}
	
	function trocaAspas(valor){
		while( valor.lastIndexOf('"') >=0 ){
			valor = valor.replace('"','&quot;');
		}
		return valor;
	}
//  End -->



