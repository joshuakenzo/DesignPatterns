function FormataDocumentaUsuario(controle){
	num = controle.value;
    if (num.length==0){
	    window.alert(" O Número do Documenta deve ser preenchido!");
	    return false;
    }
	zeros = "0000000";

    if (num.length>12){
	    window.alert("Número muito longo");
	    controle.value = num.substr(0,12);
	    return false;
    }
	
	formatado = "";
	if (num.lastIndexOf("/")<0){
		    formatado = zeros.substr(0,7-(num.length-2))+num.substr(0,num.length-2)+"/"+num.substr(num.length-2,2);
	    controle.value=formatado; 
//    }else{
//        formatado = zeros.substr(0,7-(num.length-2))+num.substr(0,num.length-2)+"/"+num.substr(num.length-2,2);
	}	
    return true;
}		

function validaDigitoDocumenta(valorDocumenta, digito){
	var documenta = getNumeroDocumentaSemFormatacao(valorDocumenta);
	if (digito.value!=calculaDigito(documenta)){
		window.alert('Dígito inválido!');
		return false;
	}
	return true;
}		

function getNumeroDocumentaSemFormatacao(num) {
    var tram = num.lastIndexOf("/");
    var numOriginal="";
    numOriginal = (tram > 0?transformaNumeroDocumentaFormatado(num):num);
    return numOriginal;
}

function transformaNumeroDocumentaFormatado(numero) {
   var numOriginal="";
   var ano="";
   var tram = numero.lastIndexOf("/");
   var anoOriginal = 0;
   if (tram > 0 ){
      numOriginal = numero.substr(0,numero.length-3);
      ano         = numero.substr(numero.length-2,2);
      ano         = (ano<70)?("20"+ano):("19"+ ano);
   }
   return ano + preencheZerosEsquerda(numOriginal,7);
}

function preencheZerosEsquerda(numero, posicoes) {
  var retorno="";
  if (numero.length>posicoes){
    retorno = numero;
  }else{
    var str="";
    for (var i=numero.length;i<posicoes;i++){
        str += "0";
    }
    retorno = str + numero;
  }
  return retorno;
}

function calculaDigito(numeroDocumenta){
    if (numeroDocumenta.length != 11){
        window.alert("Número inválido!");
        return false;
    }
    var num = numeroDocumenta.substr(4,7) + numeroDocumenta.substr(2,2);
    var indice = num.length + 1;
    var soma =0;
    var maximo = indice;
    while (indice >=2){
        var pos = maximo-indice;
        soma += num.substr(pos,1) * indice;
        --indice;
    }
    soma = 11 - (soma%11);
    if (soma == 10){
      soma = 0;
    }else{
      soma = (soma==11?1:soma);
    }
	return soma;
}

