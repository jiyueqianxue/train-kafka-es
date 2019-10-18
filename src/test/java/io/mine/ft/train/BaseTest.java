package io.mine.ft.train;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 单元测试样例
 */
@RunWith(SpringJUnit4ClassRunner.class)

public abstract class BaseTest {

	public final static Long tenantId = 0L;

	static {
		// TenantIdThreadLocal.setTenantId(tenantId);
	}
}
