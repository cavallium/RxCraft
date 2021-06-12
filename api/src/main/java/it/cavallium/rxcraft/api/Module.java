package it.cavallium.rxcraft.api;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface Module {

	Mono<Void> load();

	Mono<Void> unload();

	Mono<Void> enable();

	Mono<Void> disable();

	Flux<BlockDefinition> getBlockDefinitions();

	Flux<BlockManager> getBlockManagers();
}
