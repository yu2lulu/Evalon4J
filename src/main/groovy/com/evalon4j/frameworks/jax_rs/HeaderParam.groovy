package com.evalon4j.frameworks.jax_rs

import com.evalon4j.frameworks.Annotation

/**
 * Binds the value(s) of a HTTP header to a resource method parameter,
 * resource class field, or resource class bean property. A default value
 * can be specified using the {@link DefaultValue} annotation.
 *
 * The type {@code T} of the annotated parameter, field or property
 * must either:
 * <ol>
 * <li>Be a primitive type</li>
 * <li>Have a constructor that accepts a single {@code String} argument</li>
 * <li>Have a static method named {@code valueOf} or {@code fromString}
 * that accepts a single
 * {@code String} argument (see, for example, {@link Integer#valueOf(String)})</li>
 * <li>Have a registered implementation of {@link javax.ws.rs.ext.ParamConverterProvider}
 * JAX-RS extension SPI that returns a {@link javax.ws.rs.ext.ParamConverter}
 * instance capable of a "from string" conversion for the type.</li>
 * <li>Be {@code List<T>}, {@code Set<T>} or
 * {@code SortedSet<T>}, where {@code T} satisfies 2, 3 or 4 above.
 * The resulting collection is read-only.</li>
 * </ol>
 *
 * <p>If the type is not one of the collection types listed in 5 above and the
 * header parameter is represented by multiple values then the first value (lexically)
 * of the parameter is used.</p>
 *
 * <p>Because injection occurs at object creation time, use of this annotation
 * on resource class fields and bean properties is only supported for the
 * default per-request resource class lifecycle. Resource classes using
 * other lifecycles should only use this annotation on resource method
 * parameters.</p>
 *
 * @author Paul Sandoz
 * @author Marc Hadley
 * @see DefaultValue
 * @see javax.ws.rs.core.HttpHeaders
 * @since 1.0
 */
class HeaderParam extends Annotation {
    /**
     * Defines the name of the HTTP header whose value will be used
     * to initialize the value of the annotated method argument, class field or
     * bean property. Case insensitive.
     */
    String value = ""
}
