package com.rob.project1.resources;

import com.rob.project1.dto.PokemonDto;
import com.rob.project1.jax.PokemonJax;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.List;

@Path("/pokemon")
public class PokemonResource {

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	public List<PokemonJax> list() {
		return null;
	}

	@POST
	@Path("/{name}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response catchPokemon(@PathParam("name") String pokemonName) {
		return Response.status(Status.OK).build();
	}

	@GET
	@Path("/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public String checkPokemon(@PathParam("name") String pokemonName) {
		return pokemonName;
	}

	@PATCH
	@Path("/{name}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updatePokemon(@RequestBody PokemonJax pokemonJax ) {
		return null;
	}

	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		return "Great Success";
	}
}
