package com.coen92.ddd.aggregate.infrastructure;

import com.coen92.ddd.aggregate.domain.Document;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import static com.coen92.ddd.aggregate.domain.Document.*;

@Repository
public interface DocumentRepository extends CrudRepository<Document, DocumentId> {
    Document getById(DocumentId id);
}
