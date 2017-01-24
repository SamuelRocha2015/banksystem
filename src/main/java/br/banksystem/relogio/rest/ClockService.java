package br.banksystem.relogio.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.google.gson.Gson;

@Path("clock")
public class ClockService {

	@Path("{hora}/{min}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAngle(@PathParam("hora") long hora, @PathParam("min") long min) {

		CacheControl cc = new CacheControl();
		cc.setMaxAge(1);
		cc.setPrivate(true);

		ResponseBuilder builder = Response.ok(new Gson().toJson(new Resposta(hora, min)));
		builder.cacheControl(cc);
		return builder.build();
	}
}
