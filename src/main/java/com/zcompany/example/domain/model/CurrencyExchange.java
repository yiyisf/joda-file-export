package com.zcompany.example.domain.model;

import java.util.Map;

import javax.money.CurrencyUnit;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.gen.BeanDefinition;
import org.joda.beans.gen.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.xebia.util.export.annotation.Export;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@BeanDefinition
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class CurrencyExchange implements Bean {

    @PropertyDefinition
    @Export(columnName = "Source Currency")
    private CurrencyUnit source;

    @PropertyDefinition
    @Export(columnName = "Target Currency")
    private CurrencyUnit target;

    //------------------------- AUTOGENERATED START -------------------------
    /**
     * The meta-bean for {@code CurrencyExchange}.
     * @return the meta-bean, not null
     */
    public static CurrencyExchange.Meta meta() {
        return CurrencyExchange.Meta.INSTANCE;
    }

    static {
        MetaBean.register(CurrencyExchange.Meta.INSTANCE);
    }

    @Override
    public CurrencyExchange.Meta metaBean() {
        return CurrencyExchange.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the source.
     * @return the value of the property
     */
    public CurrencyUnit getSource() {
        return source;
    }

    /**
     * Sets the source.
     * @param source  the new value of the property
     */
    public void setSource(CurrencyUnit source) {
        this.source = source;
    }

    /**
     * Gets the the {@code source} property.
     * @return the property, not null
     */
    public final Property<CurrencyUnit> source() {
        return metaBean().source().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the target.
     * @return the value of the property
     */
    public CurrencyUnit getTarget() {
        return target;
    }

    /**
     * Sets the target.
     * @param target  the new value of the property
     */
    public void setTarget(CurrencyUnit target) {
        this.target = target;
    }

    /**
     * Gets the the {@code target} property.
     * @return the property, not null
     */
    public final Property<CurrencyUnit> target() {
        return metaBean().target().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public CurrencyExchange clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            CurrencyExchange other = (CurrencyExchange) obj;
            return JodaBeanUtils.equal(getSource(), other.getSource()) &&
                    JodaBeanUtils.equal(getTarget(), other.getTarget());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getSource());
        hash = hash * 31 + JodaBeanUtils.hashCode(getTarget());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(96);
        buf.append("CurrencyExchange{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("source").append('=').append(JodaBeanUtils.toString(getSource())).append(',').append(' ');
        buf.append("target").append('=').append(JodaBeanUtils.toString(getTarget())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code CurrencyExchange}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code source} property.
         */
        private final MetaProperty<CurrencyUnit> source = DirectMetaProperty.ofReadWrite(
                this, "source", CurrencyExchange.class, CurrencyUnit.class);
        /**
         * The meta-property for the {@code target} property.
         */
        private final MetaProperty<CurrencyUnit> target = DirectMetaProperty.ofReadWrite(
                this, "target", CurrencyExchange.class, CurrencyUnit.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "source",
                "target");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case -896505829:  // source
                    return source;
                case -880905839:  // target
                    return target;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends CurrencyExchange> builder() {
            return new DirectBeanBuilder<>(new CurrencyExchange());
        }

        @Override
        public Class<? extends CurrencyExchange> beanType() {
            return CurrencyExchange.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code source} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<CurrencyUnit> source() {
            return source;
        }

        /**
         * The meta-property for the {@code target} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<CurrencyUnit> target() {
            return target;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -896505829:  // source
                    return ((CurrencyExchange) bean).getSource();
                case -880905839:  // target
                    return ((CurrencyExchange) bean).getTarget();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -896505829:  // source
                    ((CurrencyExchange) bean).setSource((CurrencyUnit) newValue);
                    return;
                case -880905839:  // target
                    ((CurrencyExchange) bean).setTarget((CurrencyUnit) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    //-------------------------- AUTOGENERATED END --------------------------
}
