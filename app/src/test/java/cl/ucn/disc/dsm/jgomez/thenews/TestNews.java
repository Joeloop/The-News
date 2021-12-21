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

package cl.ucn.disc.dsm.jgomez.thenews;

import cl.ucn.disc.dsm.jgomez.thenews.model.News;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

/**
 * Test of {@link News}
 * @author Joel Gomez
 */
@Slf4j
public final class TestNews {

    /**
     * Test the constructor
     */

    public void testConstructor() {
        System.out.println("Testing Constructor ..");
        // Constructor Ok
        News news = new News(
                "Titulo Noticia",
                "Fuente Noticia",
                "Author Noticia",
                "https://google.com",
                "https://img2.rtve.es/imagenes/detalle-diario-clarin-2003/1591339409126.jpg",
                "Some Description",
                "Some Content",
                ZonedDateTime.now(ZoneId.of("-4"))
        );

        Assertions.assertNotNull(news, "The News was null");

        Assertions.assertNotNull(news.getId(), "The Id was null");
        Assertions.assertNotNull(news.getTitle(), "The Title was null");
        Assertions.assertNotNull(news.getSource(), "The Source was null");
        Assertions.assertNotNull(news.getAuthor(), "The Author was null");
        Assertions.assertNotNull(news.getUrl(), "The Url was null");
        Assertions.assertNotNull(news.getUrlImage(), "The UrlImage was null");
        Assertions.assertNotNull(news.getDescription(), "The Description() was null");
        Assertions.assertNotNull(news.getContent(), "The Content was null");
        Assertions.assertNotNull(news.getPublishedAt(), "The PublishedAt() was null");

        // Constructor not OK
        {
            Assertions.assertThrows(IllegalArgumentException.class, () -> new News(
                    null,
                    "Fuente Noticia",
                    "Author Noticia",
                    "https://google.com",
                    "https://img2.rtve.es/imagenes/detalle-diario-clarin-2003/1591339409126.jpg",
                    "Some Description",
                    "Some Content",
                    ZonedDateTime.now(ZoneId.of("-4"))
            ));

            Assertions.assertThrows(IllegalArgumentException.class, () -> new News(
                    "Titulo Noticia",
                    null,
                    "Author Noticia",
                    "https://google.com",
                    "https://img2.rtve.es/imagenes/detalle-diario-clarin-2003/1591339409126.jpg",
                    "Some Description",
                    "Some Content",
                    ZonedDateTime.now(ZoneId.of("-4"))
            ));

            Assertions.assertThrows(IllegalArgumentException.class, () -> new News(
                    "Titulo Noticia",
                    "Fuente Noticia",
                    null,
                    "https://google.com",
                    "https://img2.rtve.es/imagenes/detalle-diario-clarin-2003/1591339409126.jpg",
                    "Some Description",
                    "Some Content",
                    ZonedDateTime.now(ZoneId.of("-4"))
            ));

            Assertions.assertThrows(IllegalArgumentException.class, () -> new News(
                    "Titulo Noticia",
                    "Fuente Noticia",
                    "Author Noticia",
                    "https://google.com",
                    "https://img2.rtve.es/imagenes/detalle-diario-clarin-2003/1591339409126.jpg",
                    null,
                    "Some Content",
                    ZonedDateTime.now(ZoneId.of("-4"))
            ));

            Assertions.assertThrows(IllegalArgumentException.class, () -> new News(
                    "Titulo Noticia",
                    "Fuente Noticia",
                    "Author Noticia",
                    "https://google.com",
                    "https://img2.rtve.es/imagenes/detalle-diario-clarin-2003/1591339409126.jpg",
                    "Some Description",
                    null,
                    ZonedDateTime.now(ZoneId.of("-4"))
            ));

            Assertions.assertThrows(IllegalArgumentException.class, () -> new News(
                    "Titulo Noticia",
                    "Fuente Noticia",
                    "Author Noticia",
                    "https://google.com",
                    "https://img2.rtve.es/imagenes/detalle-diario-clarin-2003/1591339409126.jpg",
                    "Some Description",
                    "Some Content",
                    null
            ));
        }
    }
}