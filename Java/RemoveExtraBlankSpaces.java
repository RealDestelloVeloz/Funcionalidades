public String quitarEspaciosExtra(String mensajeCliente) {
		StringBuilder modificador = new StringBuilder(mensajeCliente);
		int contador = 0;
		char chr[] = mensajeCliente.toCharArray();
		int placeHolder = 0;
		for (int i = 0; i < chr.length; i++) {
			if (chr[i] == ' ') {
				contador++;
				placeHolder++;
			} else {
				placeHolder++;
				contador = 0;

			}
			if (contador > 1) {
				placeHolder--;
				modificador.deleteCharAt(placeHolder);
			}

		}
		mensajeCliente = "" + modificador;
		return mensajeCliente;
	}
