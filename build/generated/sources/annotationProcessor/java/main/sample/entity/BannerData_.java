package sample.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.46.2" }, date = "2021-07-01T18:50:01.266-0300")
public final class BannerData_ implements org.seasar.doma.jdbc.criteria.metamodel.EntityMetamodel<sample.entity.BannerData> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.46.2");
    }

    private final String __qualifiedTableName;

    private final sample.entity._BannerData __entityType = sample.entity._BannerData.getSingletonInternal();

    private final java.util.List<org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<?>> __allPropertyMetamodels;

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> favouriteCategoryId = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "favouriteCategoryId");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> bannerName = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "bannerName");

    public BannerData_() {
        this("");
    }

    public BannerData_(String qualifiedTableName) {
        this.__qualifiedTableName = java.util.Objects.requireNonNull(qualifiedTableName);
        java.util.ArrayList<org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<?>> __list = new java.util.ArrayList<>(2);
        __list.add(favouriteCategoryId);
        __list.add(bannerName);
        __allPropertyMetamodels = java.util.Collections.unmodifiableList(__list);
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityType<sample.entity.BannerData> asType() {
        return __qualifiedTableName.isEmpty() ? __entityType : new org.seasar.doma.jdbc.criteria.metamodel.EntityTypeProxy<>(__entityType, __qualifiedTableName);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<?>> allPropertyMetamodels() {
        return __allPropertyMetamodels;
    }

}
