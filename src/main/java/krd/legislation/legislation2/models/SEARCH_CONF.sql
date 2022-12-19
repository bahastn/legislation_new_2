alter table legsilation
    add search tsvector
    generated always as (
    setweight(to_tsvector('simple',law_title), 'A')  || ' ' ||
    setweight(to_tsvector('simple',law_type), 'B') || ' ' ||
    setweight(to_tsvector('simple',law_category), 'D') :: tsvector

    ) stored;

create index idx_search on legsilation using GIN(search);