/*
 * Copyright (C) 2021 The News
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cl.ucn.disc.dsm.jgomez.thenews.services;
import com.github.javafaker.Faker;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import cl.ucn.disc.dsm.jgomez.thenews.model.News;
import cl.ucn.disc.dsm.jgomez.thenews.services.Contracts;

/**
 * Cotract Implementation of News with Faker
 */
public class ContractsImplFaker implements Contracts {

    /**
     * @return all the News in the backend sorted by publishedAt
     */
    @Override
    public List<News> retrieveNews(final int newsQuantity) {

        // Faker provider
        Faker faker = new Faker();
        final  List<News> newsList = new ArrayList<>();
        for (int i = 0; i < newsQuantity; i++) {
            News news = new News(
                    faker.funnyName().name(),
                    faker.university().name(),
                    faker.dragonBall().character(),
                    faker.internet().url(),
                    faker.internet().url(),
                    faker.backToTheFuture().quote(),
                    faker.elderScrolls().quote(),
                    ZonedDateTime.now(ZoneId.of("-4"))
            );
            newsList.add(news);
        }
        return newsList;
    }
}