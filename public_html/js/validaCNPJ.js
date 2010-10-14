function checkCNPJ(CNPJ) {
                novoCnpj = "";
                for (i = 0; i < CNPJ.length; i++) {
                    if ((CNPJ.charAt(i) >= "0") && (CNPJ.charAt(i) <= "9")) {
                        novoCnpj += CNPJ.charAt(i);
                    }
                }

                if (novoCnpj.length != 14 || novoCnpj == "00000000000000" ||
                        novoCnpj == "11111111111111" || novoCnpj == "22222222222222" || novoCnpj == "33333333333333" ||
                        novoCnpj == "44444444444444" || novoCnpj == "55555555555555" || novoCnpj == "66666666666666" ||
                        novoCnpj == "77777777777777" || novoCnpj == "88888888888888" || novoCnpj == "99999999999999" ) {
                    return false;
                }
		
                soma = 0;
                for (i=0, j = 5; i < 12; i++) {
                    soma += j-- * (parseInt(novoCnpj.charAt(i)));
                    if (j < 2) j = 9;
                }
		
                soma = 11 - (soma % 11);
		
                if (soma > 9) {
                    soma = 0;
                }
                if (soma == parseInt(novoCnpj.charAt(12))) {
                    soma = 0;
                    for (i=0, j = 6; i < 13; i++) {
                        soma += j-- * parseInt(novoCnpj.charAt(i));
                        if (j < 2) j = 9;
                    }
                    soma = 11 - (soma % 11);
                    if (soma > 9) {
                        soma = 0;
                    }
                    if (soma == parseInt(novoCnpj.charAt(13))) {
                        return true;
                    }
                }
                return false;
            }