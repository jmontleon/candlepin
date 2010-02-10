/**
 * Copyright (c) 2009 Red Hat, Inc.
 *
 * This software is licensed to you under the GNU General Public License,
 * version 2 (GPLv2). There is NO WARRANTY for this software, express or
 * implied, including the implied warranties of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. You should have received a copy of GPLv2
 * along with this software; if not, see
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.txt.
 *
 * Red Hat trademarks are not licensed under GPLv2. No permission is
 * granted to use or replicate Red Hat trademarks that are incorporated
 * in this software or its documentation.
 */
package org.fedoraproject.candlepin.product.impl;

import org.fedoraproject.candlepin.model.Product;
import org.fedoraproject.candlepin.model.ProductCurator;
import org.fedoraproject.candlepin.product.ProductServiceAdapter;

import com.google.inject.Inject;

import java.util.List;

public class OnSiteProductServiceAdapter implements ProductServiceAdapter {

    private ProductCurator prodCurator;

    @Inject
    public OnSiteProductServiceAdapter(ProductCurator prodCurator) {
        this.prodCurator = prodCurator;
    }

    @Override
    //TODO Figure out what this really maps to
    public Product getProduct(String oid) {
        return prodCurator.lookupByLabel(oid);
    }

    @Override
    public List<Product> getProducts() {
        return prodCurator.findAll();
    }

}
