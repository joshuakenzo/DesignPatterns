function SetAjuda(txt) { 
	help.innerText = txt ;
}

function PreenchimentoObrigatorio(campo, msg) {
   str = campo.value;
   if (str.length==0){
	   window.alert(msg);
	   return false;
   }
  return true;
} 

function FormataData(campo){
   num = campo.value;
   if (!PrenchimentoObrigatorio(campo,"A data deve ser preenchida!")){
	   return false;
   }
   if (num.length>8){
	   window.alert("Data muito longo");
	   num = num.substr(0,8);
   }

  formatado = num.substr(0,2)+"/"+num.substr(2,2)+"/"+num.substr(4,4);
  campo.value=formatado; 
  return true;
} 

function validaLetra(teclapres, campo){
	var posicao = campo.value.length;
	var tecla = teclapres.keyCode;

	if ( (posicao <= 1) )  {
	    if ( (tecla==8) || (((tecla >=48)&&(tecla <=57)))){
           teclapres.keyCode = 0;
        }
    }
}	

function validaNumero(teclapres, campo){
	var posicao = campo.value.length;
	var tecla = teclapres.keyCode;

	if ( (posicao <= 1) )  {
	    if (!( (tecla ==8) || ((tecla >=48)&&(tecla <=57)))){
           teclapres.keyCode = 0;
        }
    }
}	

