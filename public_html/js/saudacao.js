<!--
 function makeArray() {
	var args = makeArray.arguments;
	for (var i = 0; i < args.length; i++) {
		this[i] = args[i];
	}
	this.length = args.length;
 }
 function fixDate(date) {
	var base = new Date(0);
	var skew = base.getTime();
	if (skew > 0)
		date.setTime(date.getTime() - skew);
 }
 function getString(date) {
	var DiaDaSemana = new makeArray("Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado");
	var months = new makeArray("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro");
	return "<span class='texto_normal_pequeno'>&nbsp;&nbsp;&nbsp;" + DiaDaSemana[date.getDay()] + "," + date.getDate()  + " de " + months[date.getMonth()] + " de " + (date.getFullYear()) + ".&nbsp;</span>";
 }
 var cur = new Date();
 fixDate(cur);
 var str = getString(cur);
 document.write(str);
// -->

